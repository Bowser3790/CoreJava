package EnumExceptions;

public enum UsStates {

    // Enum is storage to store constant data for you applications
    // for example: car sales application you need to store car "Makes" into you application
    // and this info does not change.
    // you would store this into ENUM

    RHODE_ISLAND("Rhode-Island", "RI", "Providence"),
    SOUTH_CAROLINAS("South Carolina", "SCh", "Columbia"),
    MASSACHUSETTS("Massachusetts","MA","Boston"),
    FLORIDA("Florida", "FL", "Jacksonville"),

    ;
    private final String stateName;
    private final String abbreviation;
    private final String captial;

    UsStates(String stateName, String abbreviation, String captial) {
        this.stateName = stateName;
        this.abbreviation = abbreviation;
        this.captial = captial;
    }

    public String getStateName() {
        return stateName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCaptial() {
        return captial;
    }
}
