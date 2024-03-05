package org.example.mappingData;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class EID_FIXED_PERSONAL_DATA extends Structure {

    int EID_MAX_PersonalNumber = 13;
    int EID_MAX_Surname = 200;
    int EID_MAX_GivenName = 200;
    int EID_MAX_ParentGivenName = 200;
    int EID_MAX_Sex = 2;
    int EID_MAX_PlaceOfBirth = 200;
    int EID_MAX_StateOfBirth = 200;
    int EID_MAX_DateOfBirth = 10;
    int EID_MAX_CommunityOfBirth = 200;
    int EID_MAX_StatusOfForeigner = 200;
    int EID_MAX_NationalityFull = 200;

    public byte[] personalNumber = new byte[EID_MAX_PersonalNumber];
    public int personalNumberSize;
    public byte[] surname = new byte[EID_MAX_Surname];
    public int surnameSize;
    public byte[] givenName = new byte[EID_MAX_GivenName];
    public int givenNameSize;
    public byte[] parentGivenName = new byte[EID_MAX_ParentGivenName];
    public int parentGivenNameSize;
    public byte[] sex = new byte[EID_MAX_Sex];
    public int sexSize;
    public byte[] placeOfBirth = new byte[EID_MAX_PlaceOfBirth];
    public int placeOfBirthSize;
    public byte[] stateOfBirth = new byte[EID_MAX_StateOfBirth];
    public int stateOfBirthSize;
    public byte[] dateOfBirth = new byte[EID_MAX_DateOfBirth];
    public int dateOfBirthSize;
    public byte[] communityOfBirth = new byte[EID_MAX_CommunityOfBirth];
    public int communityOfBirthSize;
    public byte[] statusOfForeigner = new byte[EID_MAX_StatusOfForeigner];
    public int statusOfForeignerSize;
    public byte[] nationalityFull = new byte[EID_MAX_NationalityFull];
    public int nationalityFullSize;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(
                "personalNumber", "personalNumberSize",
                "surname", "surnameSize",
                "givenName", "givenNameSize",
                "parentGivenName", "parentGivenNameSize",
                "sex", "sexSize",
                "placeOfBirth", "placeOfBirthSize",
                "stateOfBirth", "stateOfBirthSize",
                "dateOfBirth", "dateOfBirthSize",
                "communityOfBirth", "communityOfBirthSize",
                "statusOfForeigner", "statusOfForeignerSize",
                "nationalityFull", "nationalityFullSize"
        );
    }
}
