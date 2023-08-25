package com.example.fedexintegration.service;

import com.example.fedexintegration.domain.IncomingAddress;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


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


    }
}
