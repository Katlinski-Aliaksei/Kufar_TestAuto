package elements;

import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {
    private AndroidDriver driver = InitialDriver.getDriver();

    public void searchAndClickButtonBy(WebElement webElement) {
        WebElement searchButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(webElement));
        searchButton.click();

    }
    public void clickButtonBackOnKeyboard() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
