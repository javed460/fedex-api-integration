package com.example.fedexintegration.dto.pickup.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OptionDTO {
    private String carrier;
    private boolean available;
    private String pickupDate;
    private String cutOffTime;
    private AccessTimeDTO accessTime;
    private boolean residentialAvailable;
    private String countryRelationship;
    private String scheduleDay;
    private String defaultReadyTime;
    private String defaultLatestTimeOptions;
    private String earlyCutOffTime;
    private EarlyAccessTimeDTO earlyAccessTime;
    private String earlyPickupLocationId;
    private List<String> readyTimeOptions;
    private List<String> latestTimeOptions;
}
