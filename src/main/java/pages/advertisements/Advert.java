package pages.advertisements;

import elements.Buttons;
import elements.Elements;
import elements.Screen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Advert extends BasePage {
    @AndroidFindBy(id = "se.scmv.belarus:id/favoriteIcon")
    private WebElement FAVORITE_ICON;
    @AndroidFindBy(id = "se.scmv.belarus:id/title")
    private WebElement AD_TITLE;
    @AndroidFindBy(id = "se.scmv.belarus:id/priceByn")
    private WebElement AD_PRICE;
    @AndroidFindBy(id = "se.scmv.belarus:id/adId")
    private WebElement AD_ID;
    @AndroidFindBy(id = "se.scmv.belarus:id/userInfoContainer")
    private WebElement SELLER_INFO;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view" +
            ".ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view" +
            ".ViewGroup/android.widget.FrameLayout/android.widget.Button")
    private WebElement FOLLOW_BUTTON;
    @AndroidFindBy(accessibility = "Перейти вверх")
    private WebElement BACK_BUTTON;

    public Advert(AndroidDriver driver) {
        super(driver);
    }

    public void addAdToFavorites() {
        buttons.searchAndClickButtonBy(FAVORITE_ICON);
        buttons.clickButtonBackOnKeyboard();
    }

    public String getAdTitle() {
        return elements.getTextFromElement(AD_TITLE);
    }

    public String getAdPrice() {
        return elements.getTextFromElement(AD_PRICE);
    }

    public String getAdId() {
        return elements.getTextFromElement(AD_ID);
    }

    public void goToSeller() {
        screen.scrollablePage("Подписаться");
        buttons.searchAndClickButtonBy(SELLER_INFO);
    }

    public void followOnSeller() {
        screen.scrollablePage("Подписаться");
        buttons.searchAndClickButtonBy(FOLLOW_BUTTON);
    }

    public void goBack() {
        buttons.searchAndClickButtonBy(BACK_BUTTON);
    }
}
