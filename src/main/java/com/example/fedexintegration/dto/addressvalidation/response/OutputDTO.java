package com.example.fedexintegration.dto.addressvalidation.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OutputDTO {
    private List<ResolvedAddressDTO> resolvedAddresses;
    private List<AlertDTO> alerts;
}