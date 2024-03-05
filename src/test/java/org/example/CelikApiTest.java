package org.example;

import org.example.dto.IDInfo;
import org.example.exception.EIDException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CelikApiTest {

    private CelikApi celikApi;

    @BeforeEach
    public void init() {
        celikApi = new CelikApiImpl();
    }

    @Test
    public void testUse_WhenReadDataWithCardReader_ReturnIDInfo() throws EIDException {
        celikApi.init();
        IDInfo idInfo = celikApi.read();
        System.out.println(idInfo);
        celikApi.cleanup();
    }
}
