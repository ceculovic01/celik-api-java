package org.example.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EIDConstants {

    public static String getNameByValue(int value) {
        return switch (value) {
            case -1 -> "EID_E_GENERAL_ERROR";
            case -2 -> "EID_E_INVALID_PARAMETER";
            case -3 -> "EID_E_VERSION_NOT_SUPPORTED";
            case -4 -> "EID_E_NOT_INITIALIZED";
            case -5 -> "EID_E_UNABLE_TO_EXECUTE";
            case -6 -> "EID_E_READER_ERROR";
            case -7 -> "EID_E_CARD_MISSING";
            case -8 -> "EID_E_CARD_UNKNOWN";
            case -9 -> "EID_E_CARD_MISMATCH";
            case -10 -> "EID_E_UNABLE_TO_OPEN_SESSION";
            case -11 -> "EID_E_DATA_MISSING";
            case -12 -> "EID_E_CARD_SECFORMAT_CHECK_ERROR";
            case -13 -> "EID_E_SECFORMAT_CHECK_CERT_ERROR";
            case -14 -> "EID_E_INVALID_PASSWORD";
            case -15 -> "EID_E_PIN_BLOCKED";
            default -> null;
        };
    }

    public static String getCardType(int value) {
        return switch (value) {
            case 1 -> "EID_CARD_ID2008";
            case 2 -> "EID_CARD_ID2014";
            default -> "EID_CARD_IF2020";
        };
    }
}
