package elements;

import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;

public class Screen {
    private AndroidDriver driver = InitialDriver.getDriver();
    private  static Logger log=Logger.getLogger(Screen.class);

    public void scrollablePage(String text){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains("+"\""+text+"\""+").instance(0));");
        log.info("Page is scrollable");
    }
}
