package org.example;

import org.example.exception.EIDException;
import org.example.library.CelikLibrary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CelikApiUnitTest {

    private CelikApi celikApi;

    private CelikLibrary celikLibrary;

    @BeforeEach
    void init() {
        celikLibrary = Mockito.mock(CelikLibrary.class);
        celikApi = new CelikApiImpl(celikLibrary);
    }

    @Test
    void init_WhenGeneralError_ThrowsEIDException() {
        when(celikLibrary.EidStartup(3)).thenReturn(-1);

        Assertions.assertThrows(EIDException.class, () -> celikApi.init());
    }

    @Test
    void init_WhenEIDOK_Success() throws EIDException {
        when(celikLibrary.EidStartup(3)).thenReturn(0);
        celikApi.init();
    }

    @Test
    void read_WhenBeginReadReturnsCardMissing_ThrowsEIDException() {
        when(celikLibrary.EidBeginRead(any(), any())).thenReturn(-7);
        Assertions.assertThrows(EIDException.class, () -> celikApi.read());
    }

    @Test
    void read_WhenReadDocumentDataUnableToExecute_ThrowsEIDException() {
        when(celikLibrary.EidBeginRead(any(), any())).thenReturn(0);
        when(celikLibrary.EidReadDocumentData(any())).thenReturn(-5);
        Assertions.assertThrows(EIDException.class, () -> celikApi.read());
    }

    @Test
    void read_WhenReadFixedPersonalDataUnableToExecute_ThrowsEIDException() {
        when(celikLibrary.EidBeginRead(any(), any())).thenReturn(0);
        when(celikLibrary.EidReadDocumentData(any())).thenReturn(0);
        when(celikLibrary.EidReadFixedPersonalData(any())).thenReturn(-5);
        Assertions.assertThrows(EIDException.class, () -> celikApi.read());
    }

    @Test
    void read_WhenReadVariablePersonalDataUnableToExecute_ThrowsEIDException() {
        when(celikLibrary.EidBeginRead(any(), any())).thenReturn(0);
        when(celikLibrary.EidReadDocumentData(any())).thenReturn(0);
        when(celikLibrary.EidReadFixedPersonalData(any())).thenReturn(0);
        when(celikLibrary.EidReadVariablePersonalData(any())).thenReturn(-5);
        Assertions.assertThrows(EIDException.class, () -> celikApi.read());
    }

    @Test
    void read_WhenReadPortraitUnableToExecute_ThrowsEIDException() {
        when(celikLibrary.EidBeginRead(any(), any())).thenReturn(0);
        when(celikLibrary.EidReadDocumentData(any())).thenReturn(0);
        when(celikLibrary.EidReadFixedPersonalData(any())).thenReturn(0);
        when(celikLibrary.EidReadPortrait(any())).thenReturn(-5);
        Assertions.assertThrows(EIDException.class, () -> celikApi.read());
    }

    @Test
    void read_WhenEidEndRGeneralError_ThrowsEIDException() {
        when(celikLibrary.EidBeginRead(any(), any())).thenReturn(0);
        when(celikLibrary.EidReadDocumentData(any())).thenReturn(0);
        when(celikLibrary.EidReadFixedPersonalData(any())).thenReturn(0);
        when(celikLibrary.EidReadPortrait(any())).thenReturn(0);
        when(celikLibrary.EidEndRead()).thenReturn(-1);
        Assertions.assertThrows(EIDException.class, () -> celikApi.read());
    }

    @Test
    void read_Success() throws EIDException {
        when(celikLibrary.EidBeginRead(any(), any())).thenReturn(0);
        when(celikLibrary.EidReadDocumentData(any())).thenReturn(0);
        when(celikLibrary.EidReadFixedPersonalData(any())).thenReturn(0);
        when(celikLibrary.EidReadPortrait(any())).thenReturn(0);
        when(celikLibrary.EidEndRead()).thenReturn(0);
        celikApi.read();
    }

    @Test
    void cleanup_WhenGeneralError_ThrowsEIDException() {
        when(celikLibrary.EidCleanup()).thenReturn(-1);
        Assertions.assertThrows(EIDException.class, () -> celikApi.cleanup());
    }

    @Test
    void cleanup_Success() throws EIDException {
        when(celikLibrary.EidCleanup()).thenReturn(0);
        celikApi.cleanup();
    }

}
