package org.example.library;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;
import org.example.mappingData.*;

public interface CelikLibrary extends Library {

    static CelikLibrary getInstance(String libraryPath) {
        return Native.load(libraryPath, CelikLibrary.class);
    }

    int EidStartup(int nApiVersion);

    int EidCleanup();

    int EidBeginRead(String szReader, IntByReference pnCardType);

    int EidEndRead();

    int EidReadDocumentData(EID_DOCUMENT_DATA eidDocumentData);

    int EidReadFixedPersonalData(EID_FIXED_PERSONAL_DATA eidFixedPersonalData);

    int EidReadVariablePersonalData(EID_VARIABLE_PERSONAL_DATA eidVariablePersonalData);

    int EidReadPortrait(EID_PORTRAIT eidPortrait);

}
