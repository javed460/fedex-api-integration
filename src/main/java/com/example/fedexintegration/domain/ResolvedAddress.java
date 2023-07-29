package com.example.fedexintegration.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ResolvedAddress {
    private List<String> streetLinesToken;
    private String city;
    private String stateOrProvinceCode;
    private String countryCode;
}
