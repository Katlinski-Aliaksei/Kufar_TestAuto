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
//        if (PropertiesConfig.getProperty("nameDevice").equals(Devices.REALME6PRO.getType())) {
//            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
//            cap.setCapability(MobileCapabilityType.NO_RESET, false);
//            cap.setCapability("autoGrandPermission", PropertiesConfig.getProperty("Platform"));
//            cap.setCapability("appPackage", "se.scmv.belarus");
//            cap.setCapability("appActivity", "se.scmv.belarus.activities.SplashScreenActivity");
//        } else if (PropertiesConfig.getProperty("nameDevice").equals(Devices.XIAOMI.getType())) {
//            //TODO Capability для другого девайса
//        }


        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        //cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        // cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\anduser\\Downloads\\se.scmv.belarus_v1.70.2_1702.apk");
        //cap = capability();
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
