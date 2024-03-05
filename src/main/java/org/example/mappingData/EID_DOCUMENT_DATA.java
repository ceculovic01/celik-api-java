package org.example.mappingData;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class EID_DOCUMENT_DATA extends Structure {

    int EID_MAX_DocRegNo = 9;
    int EID_MAX_DocumentType = 2;
    int EID_MAX_IssuingDate = 10;
    int EID_MAX_ExpiryDate = 10;
    int EID_MAX_IssuingAuthority = 100;
    int EID_MAX_DocumentSerialNumber = 10;
    int EID_MAX_ChipSerialNumber = 14;
    public byte[] docRegNo = new byte[EID_MAX_DocRegNo];
    public int docRegNoSize;
    public byte[] documentType = new byte[EID_MAX_DocumentType];
    public int documentTypeSize;
    public byte[] issuingDate = new byte[EID_MAX_IssuingDate];
    public int issuingDateSize;
    public byte[] expiryDate = new byte[EID_MAX_ExpiryDate];
    public int expiryDateSize;
    public byte[] issuingAuthority = new byte[EID_MAX_IssuingAuthority];
    public int issuingAuthoritySize;
    public byte[] documentSerialNumber = new byte[EID_MAX_DocumentSerialNumber];
    public int documentSerialNumberSize;
    public byte[] chipSerialNumber = new byte[EID_MAX_ChipSerialNumber];
    public int chipSerialNumberSize;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(
                "docRegNo", "docRegNoSize",
                "documentType", "documentTypeSize",
                "issuingDate", "issuingDateSize",
                "expiryDate", "expiryDateSize",
                "issuingAuthority", "issuingAuthoritySize",
                "documentSerialNumber", "documentSerialNumberSize",
                "chipSerialNumber", "chipSerialNumberSize"
        );
    }
}
