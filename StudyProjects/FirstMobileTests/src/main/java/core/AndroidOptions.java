package core;

import elements.Buttons;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidOptions {


    static AndroidDriver driver;
    Buttons elements=new Buttons();


    public DesiredCapabilities getConnect() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        // cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\anduser\\Downloads\\se.scmv.belarus_v1.70.2_1702.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        return cap;
    }

    public WebElement searchButton(String xPath) {
        WebElement searchButton = new WebDriverWait(driver, 10000)
                .until(ExpectedConditions.elementToBeClickable((By.id(
                        xPath))));
        searchButton.click();
        return searchButton;
    }

    public void setLoginAndPassword(String xPath) throws InterruptedException, MalformedURLException {
        searchButton(xPath);
        Thread.sleep(3000);
        driver.findElement(By.id("com.google.android.gms:id/cancel")).click();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"))
                .sendKeys("katlinskiialeks@gmail.com");


        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"))
                .sendKeys("192966804Kat");

        driver.findElement(By.id("se.scmv.belarus:id/login")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("se.scmv.belarus:id/avatar")).click();


        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Выйти\").instance(0));");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.TextView"))
                .click();
        Thread.sleep(3000);


    }
}
