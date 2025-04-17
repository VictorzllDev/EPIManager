package managerepi;

public enum EPIUpdateReason {
    DAMAGED("Damaged or broken"),
    EXPIRED("Expired or out of validity"),
    UPGRADE("Upgraded to a better model");

    private final String description;

    EPIUpdateReason(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
