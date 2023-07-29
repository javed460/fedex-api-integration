package com.example.fedexintegration.dto.addressvalidation.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddressValidationResponseDTO {
    private String transactionId;
    private String customerTransactionId;
    private OutputDTO output;
}