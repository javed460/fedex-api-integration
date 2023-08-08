package com.example.fedexintegration.transformer;

import com.example.fedexintegration.domain.IncomingAddress;
import com.example.fedexintegration.dto.addressvalidation.request.AddressDTO;
import com.example.fedexintegration.dto.addressvalidation.request.AddressValidationRequestDTO;
import com.example.fedexintegration.dto.addressvalidation.request.AddressesToValidateDTO;

import static java.util.Arrays.asList;

public final class AddressValidationRequestDTOTransformer {
    private static final String GB = "GB";

    public static AddressValidationRequestDTO transformToAddressValidationDTO(IncomingAddress incomingAddress) {

        AddressValidationRequestDTO validationRequestDTO = new AddressValidationRequestDTO();
        AddressesToValidateDTO addressesToValidateDTO = new AddressesToValidateDTO();

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCity(incomingAddress.getCity());
        addressDTO.setPostalCode(incomingAddress.getPostalCode());
        addressDTO.setCountryCode(GB);
        addressDTO.setStreetLines(incomingAddress.getStreetLines());
        addressesToValidateDTO.setAddress(addressDTO);

        validationRequestDTO.setAddressesToValidate(asList(addressesToValidateDTO));

        return validationRequestDTO;
    }

}
