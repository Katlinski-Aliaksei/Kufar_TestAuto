package elements;

import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons  {

//    static AndroidDriver driver;
//    DesiredCapabilities cap = new DesiredCapabilities();
    private AndroidDriver driver = InitialDriver.getDriver();
    //TODO Предлагаю сделать переопределение метода searchAndClickButtonBy() без уточнений об типе локаторов
    public WebElement searchAndClickButtonById(By id) {
        WebElement searchButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(id));
        searchButton.click();
        return searchButton;
    }

    public void searchAndClickButtonBy(WebElement webElement) {
        WebElement searchButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(webElement));
        searchButton.click();
    }

    public void clickButtonBackOnKeyboard() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }


    public WebElement searchAndClickButtonByXPath(By xpath) {
        WebElement searchButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(xpath));
        searchButton.click();
        return searchButton;
    }



}
