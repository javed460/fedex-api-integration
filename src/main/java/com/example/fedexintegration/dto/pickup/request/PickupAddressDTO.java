package com.example.fedexintegration.dto.pickup.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PickupAddressDTO {
    private List<String> streetLines;
    private String urbanizationCode;
    private String city;
    private String stateOrProvinceCode;
    private String postalCode;
    private String countryCode;
    private boolean residential;
    private String addressClassification;
}
