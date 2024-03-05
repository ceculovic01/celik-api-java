package org.example.mapper;

import org.example.dto.*;
import org.example.mappingData.EID_DOCUMENT_DATA;
import org.example.mappingData.EID_FIXED_PERSONAL_DATA;
import org.example.mappingData.EID_PORTRAIT;
import org.example.mappingData.EID_VARIABLE_PERSONAL_DATA;

import java.nio.charset.StandardCharsets;

public class Mapper {

    public Mapper() {

    }

    public IDInfo getIDInfo(EID_DOCUMENT_DATA eidDocumentData, EID_FIXED_PERSONAL_DATA eidFixedPersonalData,
                             EID_VARIABLE_PERSONAL_DATA eidVariablePersonalData, EID_PORTRAIT eidPortrait) {
        IDInfo idInfo = new IDInfo();

        idInfo.setDocRegNo(new String(eidDocumentData.docRegNo, 0,
                eidDocumentData.docRegNoSize, StandardCharsets.UTF_8));
        idInfo.setDocumentType(new String(eidDocumentData.documentType, 0,
                eidDocumentData.documentTypeSize, StandardCharsets.UTF_8));
        idInfo.setIssuingDate(new String(eidDocumentData.issuingDate, 0,
                eidDocumentData.issuingDateSize, StandardCharsets.UTF_8));
        idInfo.setExpiryDate(new String(eidDocumentData.expiryDate, 0,
                eidDocumentData.expiryDateSize, StandardCharsets.UTF_8));
        idInfo.setIssuingAuthority(new String(eidDocumentData.issuingAuthority, 0,
                eidDocumentData.issuingAuthoritySize, StandardCharsets.UTF_8));
        idInfo.setDocumentSerialNumber(new String(eidDocumentData.documentSerialNumber, 0,
                eidDocumentData.documentSerialNumberSize, StandardCharsets.UTF_8));
        idInfo.setChipSerialNumber(new String(eidDocumentData.chipSerialNumber, 0,
                eidDocumentData.chipSerialNumberSize, StandardCharsets.UTF_8));

        idInfo.setPersonalNumber(new String(eidFixedPersonalData.personalNumber, 0,
                eidFixedPersonalData.personalNumberSize, StandardCharsets.UTF_8));
        idInfo.setSurname(new String(eidFixedPersonalData.surname, 0,
                eidFixedPersonalData.surnameSize, StandardCharsets.UTF_8));
        idInfo.setGivenName(new String(eidFixedPersonalData.givenName, 0,
                eidFixedPersonalData.givenNameSize, StandardCharsets.UTF_8));
        idInfo.setParentGivenName(new String(eidFixedPersonalData.parentGivenName, 0,
                eidFixedPersonalData.parentGivenNameSize, StandardCharsets.UTF_8));
        idInfo.setSex(new String(eidFixedPersonalData.sex, 0,
                eidFixedPersonalData.sexSize, StandardCharsets.UTF_8));
        idInfo.setPlaceOfBirth(new String(eidFixedPersonalData.placeOfBirth, 0,
                eidFixedPersonalData.placeOfBirthSize, StandardCharsets.UTF_8));
        idInfo.setStateOfBirth(new String(eidFixedPersonalData.stateOfBirth, 0,
                eidFixedPersonalData.stateOfBirthSize, StandardCharsets.UTF_8));
        idInfo.setDateOfBirth(new String(eidFixedPersonalData.dateOfBirth, 0,
                eidFixedPersonalData.dateOfBirthSize, StandardCharsets.UTF_8));
        idInfo.setCommunityOfBirth(new String(eidFixedPersonalData.communityOfBirth, 0,
                eidFixedPersonalData.communityOfBirthSize, StandardCharsets.UTF_8));
        idInfo.setStatusOfForeigner(new String(eidFixedPersonalData.statusOfForeigner, 0,
                eidFixedPersonalData.statusOfForeignerSize, StandardCharsets.UTF_8));
        idInfo.setNationalityFull(new String(eidFixedPersonalData.nationalityFull, 0,
                eidFixedPersonalData.nationalityFullSize, StandardCharsets.UTF_8));

        idInfo.setState(new String(eidVariablePersonalData.state, 0,
                eidVariablePersonalData.stateSize, StandardCharsets.UTF_8));
        idInfo.setCommunity(new String(eidVariablePersonalData.community, 0,
                eidVariablePersonalData.communitySize, StandardCharsets.UTF_8));
        idInfo.setPlace(new String(eidVariablePersonalData.place, 0,
                eidVariablePersonalData.placeSize, StandardCharsets.UTF_8));
        idInfo.setStreet(new String(eidVariablePersonalData.street, 0,
                eidVariablePersonalData.streetSize, StandardCharsets.UTF_8));
        idInfo.setHouseNumber(new String(eidVariablePersonalData.houseNumber, 0,
                eidVariablePersonalData.houseNumberSize, StandardCharsets.UTF_8));
        idInfo.setHouseLetter(new String(eidVariablePersonalData.houseLetter, 0,
                eidVariablePersonalData.houseLetterSize, StandardCharsets.UTF_8));
        idInfo.setEntrance(new String(eidVariablePersonalData.entrance, 0,
                eidVariablePersonalData.entranceSize, StandardCharsets.UTF_8));
        idInfo.setFloor(new String(eidVariablePersonalData.floor, 0,
                eidVariablePersonalData.floorSize, StandardCharsets.UTF_8));
        idInfo.setApartmentNumber(new String(eidVariablePersonalData.apartmentNumber, 0,
                eidVariablePersonalData.apartmentNumberSize, StandardCharsets.UTF_8));
        idInfo.setAddressDate(new String(eidVariablePersonalData.addressDate, 0,
                eidVariablePersonalData.addressDateSize, StandardCharsets.UTF_8));
        idInfo.setAddressLabel(new String(eidVariablePersonalData.addressLabel, 0,
                eidVariablePersonalData.addressLabelSize, StandardCharsets.UTF_8));

        byte[] bPortrait = new byte[eidPortrait.portraitSize];
        System.arraycopy(eidPortrait.portrait, 0, bPortrait, 0, eidPortrait.portraitSize);
        idInfo.setPortrait(bPortrait);

        return idInfo;
    }

}
