package com.example.fedexintegration.dto.addressvalidation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class IncomingAddressDTO {
    private List<String> streetLines;
    private String city;
    private String postalCode;
    private String countryCode;

}
