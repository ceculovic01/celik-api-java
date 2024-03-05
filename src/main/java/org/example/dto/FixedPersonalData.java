package org.example.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FixedPersonalData {

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
}
