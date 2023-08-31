package com.example.fedexintegration.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DimensionsDTO {
    private int length;
    private int width;
    private int height;
    private String units;
}
