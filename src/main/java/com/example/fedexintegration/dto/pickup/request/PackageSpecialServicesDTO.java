package com.example.fedexintegration.dto.pickup.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PackageSpecialServicesDTO {
    private List<String> specialServiceTypes;
}
