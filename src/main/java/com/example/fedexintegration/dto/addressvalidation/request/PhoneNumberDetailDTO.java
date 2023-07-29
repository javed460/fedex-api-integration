package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PhoneNumberDetailDTO {
    private NumberDTO number;
    private String permissions;
    private String usage;
    private String type;
    private String phoneNotificationFormatType;
}