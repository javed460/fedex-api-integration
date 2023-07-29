package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmailAddressDTO {
    private String emailNotificationFormatType;
    private String address;
    private String permissions;
}