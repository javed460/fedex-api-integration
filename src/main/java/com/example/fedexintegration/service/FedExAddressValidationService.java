package com.example.fedexintegration.service;

import com.example.fedexintegration.domain.IncomingAddress;
import com.example.fedexintegration.domain.ResolvedAddress;
import com.example.fedexintegration.dto.addressvalidation.request.AddressValidationRequestDTO;
import com.example.fedexintegration.dto.addressvalidation.response.AddressValidationResponseDTO;
import com.example.fedexintegration.dto.addressvalidation.response.ResolvedAddressDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.example.fedexintegration.transformer.AddressValidationRequestDTOTransformer.transformToAddressValidationDTO;


@Service
@RequiredArgsConstructor
@Slf4j
public class FedExAddressValidationService {
    private static final String API_PATH = "/address/v1/addresses/resolve";

    private final RestTemplate restTemplate;
    private final FedExTokenService fedExTokenService;

    @Value("${fedex.url}")
    private String fedExUrl;

    public ResolvedAddress validateAddress(IncomingAddress incomingAddress) {
        AddressValidationRequestDTO validationRequestDTO = transformToAddressValidationDTO(incomingAddress);

        String accessToken = fedExTokenService.getOAuth2AccessToken();
        log.info("Fetched token inside FedExAddressValidationService");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(accessToken);
        headers.set("x-locale", "en_GB");

        HttpEntity<AddressValidationRequestDTO> request = new HttpEntity<>(validationRequestDTO, headers);

        try {
            ResponseEntity<AddressValidationResponseDTO> addressValidationResponseDTO =
                    restTemplate.postForEntity(fedExUrl + API_PATH, request, AddressValidationResponseDTO.class);
            System.out.println(addressValidationResponseDTO.getBody().toString());

            ResolvedAddressDTO resolvedAddressDTO = addressValidationResponseDTO.getBody().getOutput().getResolvedAddresses().get(0);
            return new ResolvedAddress();

        } catch (Exception e) {
            log.error("Exception occurred while validating address", e);
            throw new RuntimeException();
        }

    }
}
