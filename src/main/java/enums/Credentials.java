package enums;

import configs.PropertiesConfig;

public enum Credentials {
    ALEKSEI_EMAIL(PropertiesConfig.getProperty("alekseiEmail")),
    ALEKSEI_PASS(PropertiesConfig.getProperty("alekseiPassword")),
    VADYM_EMAIL(PropertiesConfig.getProperty("vadymEmail")),
    VADYM_PASS(PropertiesConfig.getProperty("vadymPassword"));

    private final String cred;

    Credentials(String cred) {
        this.cred = cred;
    }

    public String getType() {
        return cred;
    }
}
