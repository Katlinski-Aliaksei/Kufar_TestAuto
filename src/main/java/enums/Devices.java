package enums;

public enum Devices {
    REALME6PRO("REALME6PRO"),
    REDMINOTE8("REDMINOTE8");

    private final String device;

    Devices(String device) {
        this.device = device;
    }

    public String getType() {
        return device;
    }
}
