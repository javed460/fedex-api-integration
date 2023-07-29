package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class AddressDTO {
    private List<String> streetLines;
    private String city;
    private String stateOrProvinceCode;
    private String postalCode;
    private String countryCode;
    private String addressVerificationId;
}