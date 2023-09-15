package com.example.fedexintegration.dto.pickup.response;

import com.example.fedexintegration.dto.addressvalidation.response.AlertDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OutputDTO {
    private String requestTimestamp;
    private List<OptionDTO> options;
    private List<AlertDTO> alerts;
}
