package org.example.mappingData;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class EID_VARIABLE_PERSONAL_DATA extends Structure {
    int EID_MAX_State = 100;
    int EID_MAX_Community = 200;
    int EID_MAX_Place = 200;
    int EID_MAX_Street = 200;
    int EID_MAX_HouseNumber = 20;
    int EID_MAX_HouseLetter = 8;
    int EID_MAX_Entrance = 10;
    int EID_MAX_Floor = 6;
    int EID_MAX_ApartmentNumber = 12;
    int EID_MAX_AddressDate = 10;
    int EID_MAX_AddressLabel = 60;

    public byte[] state = new byte[EID_MAX_State];
    public int stateSize;
    public byte[] community = new byte[EID_MAX_Community];
    public int communitySize;
    public byte[] place = new byte[EID_MAX_Place];
    public int placeSize;
    public byte[] street = new byte[EID_MAX_Street];
    public int streetSize;
    public byte[] houseNumber = new byte[EID_MAX_HouseNumber];
    public int houseNumberSize;
    public byte[] houseLetter = new byte[EID_MAX_HouseLetter];
    public int houseLetterSize;
    public byte[] entrance = new byte[EID_MAX_Entrance];
    public int entranceSize;
    public byte[] floor = new byte[EID_MAX_Floor];
    public int floorSize;
    public byte[] apartmentNumber = new byte[EID_MAX_ApartmentNumber];
    public int apartmentNumberSize;
    public byte[] addressDate = new byte[EID_MAX_AddressDate];
    public int addressDateSize;
    public byte[] addressLabel = new byte[EID_MAX_AddressLabel];
    public int addressLabelSize;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(
                "state", "stateSize",
                "community", "communitySize",
                "place", "placeSize",
                "street", "streetSize",
                "houseNumber", "houseNumberSize",
                "houseLetter", "houseLetterSize",
                "entrance", "entranceSize",
                "floor", "floorSize",
                "apartmentNumber", "apartmentNumberSize",
                "addressDate", "addressDateSize",
                "addressLabel", "addressLabelSize"
        );
    }
}
