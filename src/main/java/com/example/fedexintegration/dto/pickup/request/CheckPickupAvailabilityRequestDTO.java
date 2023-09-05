package com.example.fedexintegration.dto.pickup.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CheckPickupAvailabilityRequestDTO {
    private PickupAddressDTO pickupAddress;
    private String dispatchDate;
    private String packageReadyTime;
    private String customerCloseTime;
    private String pickupType;
    private List<String> pickupRequestType;
    private ShipmentAttributesDTO shipmentAttributes;
    private int numberOfBusinessDays;
    private List<PackageDetailDTO> packageDetails;
    private String associatedAccountNumber;
    private String associatedAccountNumberType;
    private List<String> carriers;
    private String countryRelationship;
}
