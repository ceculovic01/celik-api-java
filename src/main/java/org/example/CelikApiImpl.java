package org.example;

import com.sun.jna.ptr.IntByReference;
import org.example.dto.*;
import org.example.exception.EIDConstants;
import org.example.exception.EIDException;
import org.example.library.CelikLibrary;
import org.example.mapper.Mapper;
import org.example.mappingData.EID_DOCUMENT_DATA;
import org.example.mappingData.EID_FIXED_PERSONAL_DATA;
import org.example.mappingData.EID_PORTRAIT;
import org.example.mappingData.EID_VARIABLE_PERSONAL_DATA;

public class CelikApiImpl implements CelikApi {

    private final CelikLibrary celikLibrary;
    private final int version = 3;
    private final Mapper mapper;

    public CelikApiImpl() {
        celikLibrary = CelikLibrary.getInstance("celik/x64/CelikApi.dll");
        mapper = new Mapper();
    }

    CelikApiImpl(CelikLibrary celikLibrary) {
        this.celikLibrary = celikLibrary;
        this.mapper = new Mapper();
    }

    @Override
    public void init() throws EIDException {
        int start = celikLibrary.EidStartup(version);
        System.out.printf("EIDStartup: %d\n", start);
        handleIfError(start);
    }

    @Override
    public IDInfo read() throws EIDException {
        IntByReference cardType = new IntByReference();
        int startRead = celikLibrary.EidBeginRead("", cardType);

        System.out.printf("EIDBeginRead: %d%n", startRead);
        System.out.printf("Card type: %s\n", EIDConstants.getCardType(cardType.getValue()));
        handleIfError(startRead);

        EID_DOCUMENT_DATA documentData = readDocumentData();
        EID_FIXED_PERSONAL_DATA fixedPersonalData = readFixedPersonalData();
        EID_VARIABLE_PERSONAL_DATA variablePersonalData = readVariablePersonalData();
        EID_PORTRAIT portrait = readPortrait();

        int endRead = celikLibrary.EidEndRead();
        System.out.printf("EIDEndRead: %d\n", endRead);
        handleIfError(endRead);

        return mapper.getIDInfo(documentData, fixedPersonalData, variablePersonalData, portrait);
    }

    private EID_DOCUMENT_DATA readDocumentData() throws EIDException {

        EID_DOCUMENT_DATA eidDocumentData = new EID_DOCUMENT_DATA();

        int result = celikLibrary.EidReadDocumentData(eidDocumentData);

        System.out.printf("EIDReadDocumentData: %d\n", result);
        handleIfError(result);

        return eidDocumentData;

    }

    private EID_FIXED_PERSONAL_DATA readFixedPersonalData() throws EIDException {
        EID_FIXED_PERSONAL_DATA eidFixedPersonalData = new EID_FIXED_PERSONAL_DATA();

        int result = celikLibrary.EidReadFixedPersonalData(eidFixedPersonalData);

        System.out.printf("EIDReadFixedPersonalData: %d\n", result);
        handleIfError(result);

        return eidFixedPersonalData;
    }

    private EID_VARIABLE_PERSONAL_DATA readVariablePersonalData() throws EIDException {
        EID_VARIABLE_PERSONAL_DATA eidVariablePersonalData = new EID_VARIABLE_PERSONAL_DATA();

        int result = celikLibrary.EidReadVariablePersonalData(eidVariablePersonalData);

        System.out.printf("EIDReadVariablePersonalData: %d\n", result);
        handleIfError(result);

        return eidVariablePersonalData;
    }

    private EID_PORTRAIT readPortrait() throws EIDException {
        EID_PORTRAIT eidPortrait = new EID_PORTRAIT();

        int result = celikLibrary.EidReadPortrait(eidPortrait);
        System.out.printf("EIDReadPortrait: %d\n", result);
        handleIfError(result);

        return eidPortrait;
    }

    @Override
    public void cleanup() throws EIDException {
        int cleanup = celikLibrary.EidCleanup();
        System.out.printf("EIDCleanup: %d\n", cleanup);
        handleIfError(cleanup);
    }

    private void handleIfError(int value) throws EIDException {
        if (value != 0) {
            throw new EIDException(EIDConstants.getNameByValue(value));
        }
    }

}
