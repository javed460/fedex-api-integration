package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CompanyNameDTO {
    private String division;
    private String companyCd;
    private String name;
    private String department;
    private String storeId;
}