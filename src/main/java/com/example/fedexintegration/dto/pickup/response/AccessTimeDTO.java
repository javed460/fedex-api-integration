package com.example.fedexintegration.dto.pickup.response;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class AccessTimeDTO {
    private int hours;
    private int minutes;
}
