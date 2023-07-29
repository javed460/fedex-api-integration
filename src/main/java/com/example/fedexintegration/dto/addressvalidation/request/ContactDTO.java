package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactDTO {
    private String personName;
    private ParsedPersonNameDTO parsedPersonName;
    private String companyName;
    private String phoneNumber;
    private String phoneExtension;
    private String emailAddress;
    private String faxNumber;
    private String contactId;
    private String stateTaxId;
    private String fedralTaxId;
}