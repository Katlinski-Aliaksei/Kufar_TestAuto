package core;

import configs.PropertiesConfig;
import enums.Devices;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class InitialDriver {
    static AndroidDriver driver;
    static DesiredCapabilities cap = new DesiredCapabilities();
    private static Logger log = Logger.getLogger(InitialDriver.class);

    public static AndroidDriver getDriver() {
        if (driver == null) {
            driver = initializeDriver();
        }
        return driver;
    }

    private static AndroidDriver initializeDriver() {
        if (PropertiesConfig.getProperty("nameDevice").equals(Devices.REALME6PRO.getType())) {
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
            cap.setCapability(MobileCapabilityType.NO_RESET, false);
            cap.setCapability("autoGrandPermission", true);
            cap.setCapability("appPackage", "se.scmv.belarus");
            cap.setCapability("appActivity", "se.scmv.belarus.activities.SplashScreenActivity");
        } else if (PropertiesConfig.getProperty("nameDevice").equals(Devices.REDMINOTE8.getType())) {
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
            cap.setCapability(MobileCapabilityType.NO_RESET, false);
            cap.setCapability("autoGrandPermission", true);
            cap.setCapability("appPackage", "se.scmv.belarus");
            cap.setCapability("appActivity", "se.scmv.belarus.activities.SplashScreenActivity");
        }

        AndroidDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
            log.info("Driver is started");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
