package com.example.fedexintegration.dto.addressvalidation.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AttributesDTO {
    @JsonProperty("POBox")
    private boolean pOBox;

    @JsonProperty("POBoxOnlyZIP")
    private boolean pOBoxOnlyZIP;

    @JsonProperty("SplitZIP")
    private boolean splitZIP;

    @JsonProperty("SuiteRequiredButMissing")
    private boolean suiteRequiredButMissing;

    @JsonProperty("InvalidSuiteNumber")
    private boolean invalidSuiteNumber;

    @JsonProperty("ResolutionInput")
    private String resolutionInput;

    @JsonProperty("DPV")
    private boolean dPV;

    @JsonProperty("ResolutionMethod")
    private String resolutionMethod;

    @JsonProperty("DataVintage")
    private String dataVintage;

    @JsonProperty("MatchSource")
    private String matchSource;

    @JsonProperty("CountrySupported")
    private boolean countrySupported;

    @JsonProperty("ValidlyFormed")
    private boolean validlyFormed;

    @JsonProperty("Matched")
    private boolean matched;

    @JsonProperty("Resolved")
    private boolean resolved;

    @JsonProperty("Inserted")
    private boolean inserted;

    @JsonProperty("MultiUnitBase")
    private boolean multiUnitBase;

    @JsonProperty("ZIP11Match")
    private boolean zIP11Match;

    @JsonProperty("ZIP4Match")
    private boolean zIP4Match;

    @JsonProperty("UniqueZIP")
    private boolean uniqueZIP;

    @JsonProperty("StreetAddress")
    private boolean streetAddress;

    @JsonProperty("RRConversion")
    private boolean rRConversion;

    @JsonProperty("ValidMultiUnit")
    private boolean validMultiUnit;

    @JsonProperty("AddressType")
    private String addressType;

    @JsonProperty("AddressPrecision")
    private String addressPrecision;

    @JsonProperty("MultipleMatches")
    private boolean multipleMatches;
}