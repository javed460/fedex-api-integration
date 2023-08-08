package com.example.fedexintegration.domain;

import lombok.Data;

import java.util.List;

@Data
public class IncomingAddress {
    private List<String> streetLines;
    private String city;
    private String postalCode;
    private String countryCode;
}
