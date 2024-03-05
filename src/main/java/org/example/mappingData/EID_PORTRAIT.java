package org.example.mappingData;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class EID_PORTRAIT extends Structure {

    int EID_MAX_Portrait = 7700;
    public byte[] portrait = new byte[EID_MAX_Portrait];
    public int portraitSize;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(
                "portrait", "portraitSize"
        );
    }
}
