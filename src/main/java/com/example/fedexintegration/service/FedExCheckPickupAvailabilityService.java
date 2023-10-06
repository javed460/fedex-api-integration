package com.example.fedexintegration.service;

import com.example.fedexintegration.domain.IncomingAddress;
import com.example.fedexintegration.dto.pickup.request.CheckPickupAvailabilityRequestDTO;
import com.example.fedexintegration.dto.pickup.response.CheckPickupAvailabilityResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.example.fedexintegration.transformer.CheckPickupAvailabilityRequestDTOTransformer.transformToCheckPickupRequestDTO;


@Service
@RequiredArgsConstructor
@Slf4j
public class FedExCheckPickupAvailabilityService {
    private static final String API_PATH = "/pickup/v1/pickups/availabilities";

    private final RestTemplate restTemplate;
    private final FedExTokenService fedExTokenService;

    @Value("${fedex.url}")
    private String fedExUrl;

    public void checkPickupAvailability(IncomingAddress incomingAddress) {
        CheckPickupAvailabilityRequestDTO requestDTO = transformToCheckPickupRequestDTO(incomingAddress);

        String accessToken = fedExTokenService.getOAuth2AccessToken();
        log.info("Fetched token inside FedExCheckPickupAvailabilityService");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(accessToken);
        headers.set("x-locale", "en_GB");

        HttpEntity<CheckPickupAvailabilityRequestDTO> request = new HttpEntity<>(requestDTO, headers);

        try {
            ResponseEntity<CheckPickupAvailabilityResponseDTO> responseDTO =
                    restTemplate.postForEntity(fedExUrl + API_PATH, request, CheckPickupAvailabilityResponseDTO.class);
            System.out.println(responseDTO.getBody().toString());


        } catch (Exception e) {
            log.error("Exception occurred while calling check pickup availability api", e);
        }

    }
}
