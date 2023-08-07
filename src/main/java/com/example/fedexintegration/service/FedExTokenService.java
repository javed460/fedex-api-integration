package com.example.fedexintegration.service;

import com.example.fedexintegration.domain.FedExToken;
import com.example.fedexintegration.dto.addressvalidation.FedExTokenDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class FedExTokenService {
    private static final String ACCESS_TOKEN = "ACCESS_TOKEN";

    private final OkHttpClient okHttpClient;
    private final Request fedExTokenRequest;
    private final ObjectMapper objectMapper;
    private final Map<String, FedExToken> fedExAccessTokenMap;

    public String getOAuth2AccessToken() {
        if (fedExAccessTokenMap.isEmpty() || tokenIsExpired()) {
            Response response;
            try {
                log.info("calling fedEx api to get the access token");
                response = okHttpClient.newCall(fedExTokenRequest).execute();
                log.info("successfully retrieved access token from fedEx");
                FedExTokenDTO fedExTokenDTO = objectMapper.readValue(response.body().string(), FedExTokenDTO.class);
                cacheAccessToken(fedExTokenDTO);
                return fedExAccessTokenMap.get(ACCESS_TOKEN).getAccessToken();
            } catch (Exception e) {
                log.error("Exception occurred while fetch FedEx access token", e);
                throw new RuntimeException(e);
            }
        }
        return fedExAccessTokenMap.get(ACCESS_TOKEN).getAccessToken();
    }

    private void cacheAccessToken(FedExTokenDTO fedExTokenDTO) {
        FedExToken fedExToken = new FedExToken(fedExTokenDTO.getAccess_token(), fedExTokenDTO.getExpires_in());
        fedExToken.calculateAndSetExpiryTime();
        fedExAccessTokenMap.put(ACCESS_TOKEN, fedExToken);
    }

    private boolean tokenIsExpired() {
        FedExToken fedExToken = fedExAccessTokenMap.get(ACCESS_TOKEN);
        boolean tokenExpired = fedExToken.isTokenExpired();
        log.info("tokenIsExpired={}", tokenExpired);
        return tokenExpired;
    }

}