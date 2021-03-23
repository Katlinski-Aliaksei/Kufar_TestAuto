package elements;

import core.InitialDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.time.Duration;

public class Screen{
    private AndroidDriver driver = InitialDriver.getDriver();
    private static Logger log = Logger.getLogger(Screen.class);
    Screen screen = new Screen();


    public void scrollablePage(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(" + "\"" + text + "\"" + ").instance(0));");
        log.info("Page is scrollable");
    }



    public void scrollablePageID(By id){
       // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId("+"\""+id+"\""+").instance(0));").click();
        log.info("Page is scrollable");
    }

    public void swipeFromUpToBottom() {
        final int ANIMATION_TIME = 200;

        final int PRESS_TIME = 200;

        int edgeBorder = 10;
        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = driver.manage().window().getSize();
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release()
                    .perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
