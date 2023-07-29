package com.example.fedexintegration.config;

import com.example.fedexintegration.domain.FedExToken;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class FedExConfig {

    @Value("${fedex.client.id}")
    private String fedExClientId;

    @Value("${fedex.client.secret}")
    private String fedExClientSecret;

    @Value("${fedex.url}")
    private String fedExUrl;

    @Bean
    public Request fedExTokenRequest() {
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        String payload = "grant_type=client_credentials&client_id="+fedExClientId+"&client_secret="+fedExClientSecret;
        RequestBody body = RequestBody.create(mediaType, payload);

        return new Request.Builder()
                .url(fedExUrl+"/oauth/token")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
    }

    @Bean
    public OkHttpClient okHttpClient(){
        return new OkHttpClient();
    }

    @Bean
    public Map<String, FedExToken> fedExAccessTokenMap() {
        return new HashMap<>();
    }

}
