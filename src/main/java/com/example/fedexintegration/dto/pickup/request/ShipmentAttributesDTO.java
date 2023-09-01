package com.example.fedexintegration.dto.pickup.request;

import com.example.fedexintegration.dto.DimensionsDTO;
import com.example.fedexintegration.dto.WeightDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShipmentAttributesDTO {
    private String serviceType;
    private WeightDTO weight;
    private String packagingType;
    private DimensionsDTO dimensions;
}
