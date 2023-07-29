package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddressesToValidateDTO {
    private AddressDTO address;
    private ContactDTO contact;
    private ContactAncillaryDetailDTO contactAncillaryDetail;
    private AddressAncillaryDetailDTO addressAncillaryDetail;
    private String clientReferenceId;
    private String urbanizationCode;
}