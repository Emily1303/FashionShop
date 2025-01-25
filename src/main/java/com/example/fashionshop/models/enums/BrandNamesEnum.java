package com.example.fashionshop.models.enums;

public enum BrandNamesEnum {

    ELLIEM("EllieM"),
    MOHITO("Mohito"),
    STRADIVARIUS("Stradivarius"),
    TEODOR("Teodor"),
    RESERVED("Reserved"),
    DEICHMANN("Deichmann"),
    TENDENZ("Tendenz");

    private final String toString;

    BrandNamesEnum(String toString) {
        this.toString = toString;
    }

    public String toString() {
        return toString;
    }

}
