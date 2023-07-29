package com.example.fedexintegration.dto.addressvalidation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class AddressValidationRequestDTO {
    private String inEffectAsOfTimestamp;
    private ValidateAddressControlParametersDTO validateAddressControlParameters;
    private List<AddressesToValidateDTO> addressesToValidate;
}