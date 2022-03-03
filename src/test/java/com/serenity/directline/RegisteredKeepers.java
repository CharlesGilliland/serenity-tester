package com.serenity.directline;

public enum RegisteredKeepers {
    YOU("You (proposer)"),
    SPOUSE("Spouse (husband/wife)"),
    CIVIL_PARTNER("Civil partner"),
    PARTNER("Partner"),
    PARENT("Parent"),
    SON_OR_DAUGHTER("Son/daughter"),
    OTHER_FAMILY("Other family member"),
    BUSINESS_PARTNER("Business partner"),
    LEASED_PRIVATE("Leased – private"),
    LEASED_COMPANY("Leased – company"),
    COMPANY("Company"),
    SOCIETY_OR_CLUB("Society or club"),
    NOT_LISTED("Not listed above");


    String value;

    RegisteredKeepers(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
