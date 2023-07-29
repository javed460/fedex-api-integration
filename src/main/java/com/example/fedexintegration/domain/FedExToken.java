package com.example.fedexintegration.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FedExToken {
    private String accessToken;
    private long accessTokenDurationInSeconds;
    private long accessTokenExpiryTime;

    public FedExToken(String accessToken, long expiresIn) {
        this.accessToken = accessToken;
        this.accessTokenDurationInSeconds = expiresIn;
    }

    public boolean isTokenExpired() {
        return System.currentTimeMillis() > accessTokenExpiryTime;
    }

    // more proactive approach can be taken, by subtracting 2 or 3 mins
    public void calculateAndSetExpiryTime() {
        accessTokenExpiryTime = System.currentTimeMillis() + (accessTokenDurationInSeconds * 1000);
    }
}
