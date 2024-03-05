package org.example.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DocumentData {
    private String docRegNo;
    private String documentType;
    private String issuingDate;
    private String expiryDate;
    private String issuingAuthority;
    private String documentSerialNumber;
    private String chipSerialNumber;
}
