package com.example.fedexintegration.dto.pickup.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EarlyAccessTimeDTO {
    private int hours;
    private int minutes;
}
