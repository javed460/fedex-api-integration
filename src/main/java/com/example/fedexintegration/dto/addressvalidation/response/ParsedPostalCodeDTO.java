package com.example.fedexintegration.dto.addressvalidation.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParsedPostalCodeDTO {
    private String base;
    private String addOn;
    private String deliveryPoint;
}