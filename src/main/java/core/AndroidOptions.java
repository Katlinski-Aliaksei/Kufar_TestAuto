package core;

import elements.Buttons;
import elements.Elements;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.locks.Condition;

public class AndroidOptions {

    private By PROFILE_BUTTON = By.id("se.scmv.belarus:id/menu_profile");
    private By LOGIN_BUTTON = By.id("se.scmv.belarus:id/login");
    private By CANCEL_BUTTON = By.id("com.google.android.gms:id/cancel");//кнопка "ничего из перечисленного" всплывающее окно
    private By AVATAR_BUTTON = By.id("se.scmv.belarus:id/avatar");
    private By LOGOUT_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.TextView");
    //LOGOUT_BUTTON кнопка выйти из профиля
    private By BACK_BUTTON_PROFILE = By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]");
    //кнопка назад из меню Мои данные(при нажатии на аватар)


    private By EMAIL_PATH = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    private By PASSWORD_PATH = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    private String Email = "katlinskiialeks@gmail.com";
    private String Password = "192966804Kat";

    //Локаторы меню Профиль

    //Мои обьявления
    private By AD = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
    //Мои заказы
    private By ORDERS = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView");
    //Уведомления
    private By NOTIFICATION = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView");
    //Пакеты обновлений
    private By UPDATE_PACKAGE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView");
    //Настройки
    private By SETTINGS = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.TextView");


    Buttons buttons = new Buttons();
    public  AndroidDriver driver;
    DesiredCapabilities cap = new DesiredCapabilities();


//    public DesiredCapabilities setCapability() throws MalformedURLException {
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
//        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//        // cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//        //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\anduser\\Downloads\\se.scmv.belarus_v1.70.2_1702.apk");
//        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
//        return cap;
//    }


//    public AndroidDriver initialDriver() throws MalformedURLException {
//        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
//        this.driver = driver;
//        return driver;
//
//    }

//    public WebElement searchButtonById(By id) {
//        WebElement searchButton = new WebDriverWait(driver, 10000)
//                .until(ExpectedConditions.elementToBeClickable(id));
//        searchButton.click();
//        return searchButton;
//    }
//
//
//    public WebElement searchButtonByXPath(By xpath) {
//        WebElement searchButton = new WebDriverWait(driver, 10000)
//                .until(ExpectedConditions.elementToBeClickable(xpath));
//        searchButton.click();
//        return searchButton;
//    }
//
//
//    public void scrollablePage(String text) {
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(" + "\"" + text + "\"" + ").instance(0));");
//
//    }


//    public void setLoginAndPassword() {
//
//        searchButtonById(PROFILE_BUTTON);
//        searchButtonById(LOGIN_BUTTON);
//        searchButtonById(CANCEL_BUTTON);
//
//
//        searchButtonByXPath(EMAIL_PATH).sendKeys(Email);
//        searchButtonByXPath(PASSWORD_PATH).sendKeys(Password);
//
//        searchButtonById(LOGIN_BUTTON);
//        searchButtonById(AVATAR_BUTTON);
//        scrollablePage("Выйти");
////        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Выйти\").instance(0));");
//        searchButtonByXPath(LOGOUT_BUTTON);
//
//    }

//    public void logIn() {
//        searchButtonById(PROFILE_BUTTON);
//        searchButtonById(PROFILE_BUTTON);
//        searchButtonById(LOGIN_BUTTON);
//        searchButtonById(CANCEL_BUTTON);
//
//        searchButtonByXPath(EMAIL_PATH).sendKeys(Email);
//        searchButtonByXPath(PASSWORD_PATH).sendKeys(Password);
//
//        searchButtonById(LOGIN_BUTTON);
//        searchButtonById(AVATAR_BUTTON);
//        searchButtonByXPath(BACK_BUTTON_PROFILE);
//
//    }
//
//    public void logOut() {
//        searchButtonById(PROFILE_BUTTON);
//        searchButtonById(AVATAR_BUTTON);
//        scrollablePage("Выйти");
//        searchButtonByXPath(LOGOUT_BUTTON);
//
//    }

//    public boolean visibleElementAD() {
//
//        return isVisibleElement(AD);
//    }

//    public boolean isVisibleElement(By xpath) {
//        try {
//           // driver.findElement(xpath).isDisplayed();
//            WebElement element = new WebDriverWait(driver, 10000)
//                    .until(ExpectedConditions.visibilityOfElementLocated(xpath));
//            return true;
//        } catch (Exception ElementNotVisible) {
//            return false;
//        }
//    }


//    public boolean haveTextAD() {
//        return haveTextElement(AD, "Мои обьявления");
//    }

//    public boolean haveTextElement(By xpath, String text) {
//        try {
//            //System.out.println(driver.findElement(xpath).getText());
//            Thread.sleep(5000);
//            driver.findElement(xpath).getText().contains(text);
//            return true;
//        } catch (Exception ElementNotVisible) {
//            return false;
//        }
//    }
}

