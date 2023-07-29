package com.example.fedexintegration.dto.addressvalidation.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AlertDTO {
    private String code;
    private String message;
    private String alertType;
}