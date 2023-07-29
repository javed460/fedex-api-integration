package com.example.fedexintegration.dto.addressvalidation.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StateOrProvinceCodeTokenDTO {
    private boolean changed;
    private String value;
}
