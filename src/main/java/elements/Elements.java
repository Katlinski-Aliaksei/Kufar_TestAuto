package elements;

import core.InitialDriver;
//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {

    private AndroidDriver driver = InitialDriver.getDriver();
    private  static Logger log=Logger.getLogger(Elements.class);


    public boolean haveTextElement(By xpath, String text) {
        try {
            //System.out.println(driver.findElement(xpath).getText());
            Thread.sleep(5000);
            driver.findElement(xpath).getText().contains(text);
            log.info("Checking Text");
            return true;
        } catch (Exception ElementNotVisible) {
            return false;
        }
    }

    public boolean isVisibleElement(By xpath) {
        try {
            // driver.findElement(xpath).isDisplayed();
            WebElement element = new WebDriverWait(driver, 10000)
                    .until(ExpectedConditions.visibilityOfElementLocated(xpath));
            log.info("Checking Element");
            return true;
        } catch (Exception ElementNotVisible) {
            return false;
        }
    }

}
