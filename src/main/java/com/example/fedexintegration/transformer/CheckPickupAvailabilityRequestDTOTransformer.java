package com.example.fedexintegration.transformer;


import com.example.fedexintegration.domain.IncomingAddress;
import com.example.fedexintegration.dto.DimensionsDTO;
import com.example.fedexintegration.dto.WeightDTO;
import com.example.fedexintegration.dto.pickup.request.CheckPickupAvailabilityRequestDTO;
import com.example.fedexintegration.dto.pickup.request.PickupAddressDTO;
import com.example.fedexintegration.dto.pickup.request.ShipmentAttributesDTO;

import static java.util.Arrays.asList;

public final class CheckPickupAvailabilityRequestDTOTransformer {

    public static CheckPickupAvailabilityRequestDTO transformToCheckPickupRequestDTO(IncomingAddress incomingAddress) {
        CheckPickupAvailabilityRequestDTO requestDTO = new CheckPickupAvailabilityRequestDTO();
        requestDTO.setPickupAddress(buildPickupAddressDTO());
        requestDTO.setDispatchDate("2023-06-08");
        requestDTO.setPackageReadyTime("15:30:00");
        requestDTO.setCustomerCloseTime("18:00:00");
        requestDTO.setPickupType("ON_CALL");
        requestDTO.setPickupRequestType(asList("SAME_DAY"));
        requestDTO.setShipmentAttributes(buildShipmentAttributes());
        requestDTO.setNumberOfBusinessDays(1);
        requestDTO.setAssociatedAccountNumber("*********");
        requestDTO.setAssociatedAccountNumberType("FEDEX_EXPRESS");
        requestDTO.setCarriers(asList("FDXE"));
        requestDTO.setCountryRelationship("DOMESTIC");
        return requestDTO;
    }

    private static ShipmentAttributesDTO buildShipmentAttributes() {
        ShipmentAttributesDTO attributesDTO = new ShipmentAttributesDTO();
        attributesDTO.setServiceType("FEDEX_NEXT_DAY_END_OF_DAY");
        attributesDTO.setWeight(buildWeightDTO());
        attributesDTO.setDimensions(buildDimensionsDTO());
        return attributesDTO;
    }

    private static DimensionsDTO buildDimensionsDTO() {
        DimensionsDTO dimensionsDTO = new DimensionsDTO();
        dimensionsDTO.setHeight(9);
        dimensionsDTO.setWidth(8);
        dimensionsDTO.setUnits("CM");
        dimensionsDTO.setLength(7);
        return dimensionsDTO;
    }

    private static WeightDTO buildWeightDTO() {
        WeightDTO weightDTO = new WeightDTO();
        weightDTO.setUnits("KG");
        weightDTO.setValue(20);
        return weightDTO;
    }

    private static PickupAddressDTO buildPickupAddressDTO() {
        PickupAddressDTO addressDTO = new PickupAddressDTO();
        addressDTO.setStreetLines(asList("123 Ship Street"));
        addressDTO.setCity("Newcastle");
        addressDTO.setStateOrProvinceCode("");
        addressDTO.setPostalCode("ST5 7RB");
        addressDTO.setCountryCode("GB");
        addressDTO.setResidential(false);
        return addressDTO;
    }
}
