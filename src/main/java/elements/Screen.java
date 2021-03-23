package elements;

import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Screen {
    private AndroidDriver driver = InitialDriver.getDriver();
    private  static Logger log=Logger.getLogger(Screen.class);

    public void scrollablePage(String text){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains("+"\""+text+"\""+").instance(0));");
        log.info("Page is scrollable");
    }
    public void scrollablePageID(By id){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId("+"\""+id+"\""+").instance(0));").click();
        log.info("Page is scrollable");
    }
}
