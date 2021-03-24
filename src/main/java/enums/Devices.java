package enums;

import configs.PropertiesConfig;

public enum Devices {
    REALME6PRO("REALME6PRO"),
    XIAOMI("XIAOMI");

    private final String device;

    Devices(String device) {
        this.device = device;
    }

    public String getType() {
        return device;
    }
}
