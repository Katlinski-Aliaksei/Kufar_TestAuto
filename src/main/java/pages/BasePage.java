package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "se.scmv.belarus:id/menu_favorites")
    protected WebElement MENU_FAVORITES;

    @AndroidFindBy(id = "se.scmv.belarus:id/menu_listing")
    protected WebElement MENU_LISTING;

    @AndroidFindBy(id = "se.scmv.belarus:id/menu_add")
    protected WebElement ADD_ADVERT;

    @AndroidFindBy(id = "se.scmv.belarus:id/menu_messages")
    protected WebElement MENU_MESSAGES;

    @AndroidFindBy(id = "se.scmv.belarus:id/menu_profile")
    protected WebElement MENU_PROFILE;
}
