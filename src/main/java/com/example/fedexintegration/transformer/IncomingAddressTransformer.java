package com.example.fedexintegration.transformer;

import com.example.fedexintegration.domain.IncomingAddress;
import com.example.fedexintegration.dto.addressvalidation.IncomingAddressDTO;

public final class IncomingAddressTransformer {

    public static IncomingAddress transformToIncomingAddress(IncomingAddressDTO incomingAddressDTO) {
        IncomingAddress incomingAddress = new IncomingAddress();
        incomingAddress.setCity(incomingAddressDTO.getCity());
        incomingAddress.setPostalCode(incomingAddressDTO.getPostalCode());
        incomingAddress.setCountryCode(incomingAddressDTO.getCountryCode());
        incomingAddress.setStreetLines(incomingAddressDTO.getStreetLines());
        return incomingAddress;
    }

}
