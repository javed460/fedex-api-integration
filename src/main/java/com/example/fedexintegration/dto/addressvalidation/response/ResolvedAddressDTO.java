package com.example.fedexintegration.dto.addressvalidation.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ResolvedAddressDTO {
    private List<String> streetLinesToken;
    private String city;
    private String stateOrProvinceCode;
    private String countryCode;
    private List<Object> customerMessage;
    private List<CityTokenDTO> cityToken;
    private StateOrProvinceCodeTokenDTO stateOrProvinceCodeToken;
    private PostalCodeTokenDTO postalCodeToken;
    private ParsedPostalCodeDTO parsedPostalCode;
    private String classification;
    private boolean postOfficeBox;
    private boolean normalizedStatusNameDPV;
    private String standardizedStatusNameMatchSource;
    private String resolutionMethodName;
    private boolean ruralRouteHighwayContract;
    private boolean generalDelivery;
    private AttributesDTO attributes;
}