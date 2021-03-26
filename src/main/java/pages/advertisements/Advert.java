package pages.advertisements;

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
    @AndroidFindBy(id = "se.scmv.belarus:id/priceUsd")
    private WebElement PRICE_USD;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Количество комнат']/following-sibling::android.widget.TextView")
    private WebElement COUNT_OF_ROOMS;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Категория']/following-sibling::android.widget.TextView")
    private WebElement NAME_OF_CATEGORY;

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

    public int getPriceUSD() {
        return Integer.parseInt(parsePriceUSD(getPriceUSDInStringFormat()));
    }

    private String getPriceUSDInStringFormat() {
        screen.scrollablePage("$");
        return elements.getTextFromElement(PRICE_USD);
    }

    public void goBack() {
        buttons.searchAndClickButtonBy(BACK_BUTTON);
    }

    public String getCountOfRoomsFromAdvert() {
        screen.scrollablePage("Количество комнат");
        return elements.getTextFromElement(COUNT_OF_ROOMS);
    }

    public String getNameOfCategoryFromAdvert() {
        screen.scrollablePage("Категория");
        return elements.getTextFromElement(NAME_OF_CATEGORY);
    }

    private String parsePriceUSD(String priceString) {
        return priceString.substring(0, priceString.length() - 2).replaceAll("\\s","");
    }
}
