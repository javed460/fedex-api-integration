package com.example.fedexintegration.controller;

import com.example.fedexintegration.dto.addressvalidation.IncomingAddressDTO;
import com.example.fedexintegration.dto.addressvalidation.response.AddressValidationResponseDTO;
import com.example.fedexintegration.service.FedExAddressValidationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class FedExController {
    private final FedExAddressValidationService fedExAddressValidationService;

    @PostMapping("/address/validate")
    public AddressValidationResponseDTO validateAddress(@RequestBody IncomingAddressDTO incomingAddressDTO) {

        return null;
    }
}
