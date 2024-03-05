package org.example;

import org.example.dto.*;
import org.example.exception.EIDException;

public interface CelikApi {

    void init() throws EIDException;

    IDInfo read() throws EIDException;

    void cleanup() throws EIDException;
}
