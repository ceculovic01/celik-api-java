package org.example.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IDInfo {

    private String docRegNo;
    private String documentType;
    private String issuingDate;
    private String expiryDate;
    private String issuingAuthority;
    private String documentSerialNumber;
    private String chipSerialNumber;

    private String personalNumber;
    private String surname;
    private String givenName;
    private String parentGivenName;
    private String sex;
    private String placeOfBirth;
    private String stateOfBirth;
    private String dateOfBirth;
    private String communityOfBirth;
    private String statusOfForeigner;
    private String nationalityFull;

    private String state;
    private String community;
    private String place;
    private String street;
    private String houseNumber;
    private String houseLetter;
    private String entrance;
    private String floor;
    private String apartmentNumber;
    private String addressDate;
    private String addressLabel;

    private byte[] portrait;

    @Override
    public String toString() {
        return "IDInfo{" +
                "docRegNo='" + docRegNo + '\'' +
                ", documentType='" + documentType + '\'' +
                ", issuingDate='" + issuingDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", issuingAuthority='" + issuingAuthority + '\'' +
                ", documentSerialNumber='" + documentSerialNumber + '\'' +
                ", chipSerialNumber='" + chipSerialNumber + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", surname='" + surname + '\'' +
                ", givenName='" + givenName + '\'' +
                ", parentGivenName='" + parentGivenName + '\'' +
                ", sex='" + sex + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", stateOfBirth='" + stateOfBirth + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", communityOfBirth='" + communityOfBirth + '\'' +
                ", statusOfForeigner='" + statusOfForeigner + '\'' +
                ", nationalityFull='" + nationalityFull + '\'' +
                ", state='" + state + '\'' +
                ", community='" + community + '\'' +
                ", place='" + place + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", houseLetter='" + houseLetter + '\'' +
                ", entrance='" + entrance + '\'' +
                ", floor='" + floor + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", addressDate='" + addressDate + '\'' +
                ", addressLabel='" + addressLabel + '\'' +
                '}';
    }
}
