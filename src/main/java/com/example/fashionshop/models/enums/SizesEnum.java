package com.example.fashionshop.models.enums;

public enum SizesEnum {

    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    TWENTY_EIGHT("28"),
    THIRTY("30"),
    THIRTY_TWO("32"),
    THIRTY_FOUR("34"),
    THIRTY_SIX("36"),
    THIRTY_EIGHT("38"),
    FORTY("40"),
    FORTY_TW0("42"),
    FORTY_FOUR("44"),
    SIXTY_FIVE_C("65 C"),
    SEVENTY_B("70 B"),
    SEVENTY_C("70 C"),
    SEVENTY_FIVE_A("75 A"),
    SEVENTY_FIVE_B("75 B"),
    SEVENTY_FIVE_C("75 C"),
    SEVENTY_FIVE_D("75 D"),
    EIGHTY_B("80 B"),
    EIGHTY_C("80 C"),
    EIGHTY_FIVE_C("85 C");

    private final String toString;

    SizesEnum(String toString) {
        this.toString = toString;
    }

    public String toString() {
        return toString;
    }
}
