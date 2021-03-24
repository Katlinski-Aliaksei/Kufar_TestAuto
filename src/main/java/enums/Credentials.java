package enums;

import configs.PropertiesConfig;

public enum Credentials {
    EMAIL(PropertiesConfig.getProperty("Email")),
    PASS(PropertiesConfig.getProperty("Password"));

    private final String cred;

    Credentials(String cred) {
        this.cred = cred;
    }

    public String getType() {
        return cred;
    }
}
