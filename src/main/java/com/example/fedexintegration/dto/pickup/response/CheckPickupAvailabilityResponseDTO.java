package com.example.fedexintegration.dto.pickup.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CheckPickupAvailabilityResponseDTO {
    private String transactionId;
    private String customerTransactionId;
    private OutputDTO output;
}
