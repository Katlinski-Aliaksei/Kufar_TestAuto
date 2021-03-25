package configs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    static {
        File globalConfigFile = new File("src/main/resources/conf.properties");
        File localConfigFile = new File("src/main/resources/localConf.properties");

        Properties globalProperties = new Properties();
        Properties localProperties = new Properties();

        try {
            globalProperties.load(new FileInputStream(globalConfigFile));

            PROPERTIES = new Properties();
            PROPERTIES.putAll(globalProperties);

            if (localConfigFile.exists()) {
                localProperties.load(new FileInputStream(localConfigFile));
                PROPERTIES.putAll(localProperties);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
