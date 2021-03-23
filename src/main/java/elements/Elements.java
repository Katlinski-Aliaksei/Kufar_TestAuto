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
    private  static Logger log= Logger.getLogger(Elements.class);


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
            WebElement element = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.visibilityOfElementLocated(xpath));
            log.info("Checking Element");
            return true;
        } catch (Exception ElementNotVisible) {
            return false;
        }
    }

    public boolean isSelectedElement(By xpath) {
        try {
             driver.findElement(xpath).isSelected();
//            Boolean element = new WebDriverWait(driver, 10)
//                    .until(ExpectedConditions.elementToBeSelected(xpath));
            log.info("Select Element");
            return true;
        } catch (Exception ElementNotVisible) {
            return false;
        }
    }

    public String getTextByXPath(By xpath){
        String text=driver.findElement(xpath).getText();
        System.out.println(text);
        return text;
    }

    public String getTextById(By id){
        String text=driver.findElement(id).getText();
        return text;
    }

    public boolean isVisibleElement(WebElement webElement) {
        try {
            WebElement element = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.visibilityOf(webElement));
            log.info("Checking Element");
            return true;
        } catch (Exception ElementNotVisible) {
            return false;
        }
    }

}