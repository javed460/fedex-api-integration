package com.example.fedexintegration.dto.addressvalidation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FedExTokenDTO {
    private String access_token;
    private int expires_in;
}
