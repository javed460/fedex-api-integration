package com.example.fedexintegration.dto.addressvalidation.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResolutionInputDTO {
    private String type;
    private String description;
    private String example;
}