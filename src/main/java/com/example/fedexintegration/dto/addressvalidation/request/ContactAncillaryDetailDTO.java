package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ContactAncillaryDetailDTO {
    private List<EmailAddressDTO> emailAddresses;
    private List<SocialMediaDeailDTO> socialMediaDeails;
    private String gender;
    private String prefix;
    private List<PhoneNumberDetailDTO> phoneNumberDetails;
    private CompanyNameDTO companyName;
    private String title;
}