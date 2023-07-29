package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddressAncillaryDetailDTO {
    private String locationInCity;
    private String suite;
    private String addressVerificationOverrideReason;
    private String locationInProperty;
    private String addtionalDescriptions;
    private String department;
    private String roomFloor;
    private String crossStreet;
    private String building;
    private String apartment;
    private String room;
}