package com.example.fedexintegration.controller;

import com.example.fedexintegration.domain.IncomingAddress;
import com.example.fedexintegration.dto.addressvalidation.IncomingAddressDTO;
import com.example.fedexintegration.dto.addressvalidation.response.ResolvedAddressDTO;
import com.example.fedexintegration.service.FedExAddressValidationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.example.fedexintegration.transformer.IncomingAddressTransformer.transformToIncomingAddress;

@RestController
@Slf4j
@RequiredArgsConstructor
public class FedExController {
    private final FedExAddressValidationService fedExAddressValidationService;

    @PostMapping("/address/validate")
    public ResolvedAddressDTO validateAddress(@RequestBody IncomingAddressDTO incomingAddressDTO) {
        log.info("Received address validation request={}", incomingAddressDTO);
        IncomingAddress incomingAddress = transformToIncomingAddress(incomingAddressDTO);
        ResolvedAddressDTO resolvedAddressDTO = fedExAddressValidationService.validateAddress(incomingAddress);
        log.info("Returning resolved address");
        return resolvedAddressDTO;
    }
}
