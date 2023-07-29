package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParsedPersonNameDTO {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
}