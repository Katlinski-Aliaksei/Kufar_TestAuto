package pages;

import core.InitialDriver;
import elements.Buttons;
import elements.Elements;
import elements.Screen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Favorites extends BasePage {
    Buttons buttons = new Buttons();
    Screen screen = new Screen();
    Elements elements = new Elements();

    @AndroidFindBy(id = "se.scmv.belarus:id/menu_favorites")
    private WebElement FAVORITES;
    @AndroidFindBy(id = "se.scmv.belarus:id/login")
    private WebElement SIGN_IN_OR_LOGIN;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Объявления\"]/android.widget.LinearLayout")
    private WebElement ADVERTISEMENT;
    @AndroidFindBy(accessibility = "Поиски")
    private WebElement SEARCH_FAVORITES;
    @AndroidFindBy(accessibility = "Продавцы")
    private WebElement SELLERS;
    @AndroidFindBy(id = "se.scmv.belarus:id/subject")
    private WebElement SUBJECT_FROM_FAVORITES;
    @AndroidFindBy(id = "se.scmv.belarus:id/favoriteContainer")
    private WebElement IS_FAVORITE;
    @AndroidFindBy(id = "se.scmv.belarus:id/title")
    private WebElement TITLE_FAVORITE_SEARCH;
    @AndroidFindBy(id = "se.scmv.belarus:id/name")
    private WebElement SELLER_NAME;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget" +
            ".ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/androidx.recyclerview.widget" +
            ".RecyclerView/android.widget.FrameLayout/android.view.ViewGroup")
    private WebElement ADS_FAVORITE;

    public Favorites(AndroidDriver driver) {
        super(driver);
    }

    public void signInOrLogin() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        goToFavorites();
        buttons.searchAndClickButtonBy(SIGN_IN_OR_LOGIN);
    }

    public String getTitleFavoriteInAdvertisement() {
        chooseAdsSection();
        return SUBJECT_FROM_FAVORITES.getText();
    }

    public String getTitleFavoriteSearch() {
        chooseSearchSection();
        return TITLE_FAVORITE_SEARCH.getText();
    }

    public String getSellerNameFromFavorites() {
        chooseSellersSection();
        return SELLER_NAME.getText();
    }

    public boolean isTakeAwayAdsFromFavorites() {
        goToFavorites();
        buttons.searchAndClickButtonBy(IS_FAVORITE);
        screen.swipeFromUpToBottom();

        return elements.isVisibleElement(ADS_FAVORITE);
    }

    private void goToFavorites() {
        buttons.searchAndClickButtonBy(FAVORITES);
    }

    private void chooseAdsSection() {
        buttons.searchAndClickButtonBy(ADVERTISEMENT);
    }

    private void chooseSearchSection() {
        buttons.searchAndClickButtonBy(SEARCH_FAVORITES);
    }

    private void chooseSellersSection() {
        buttons.searchAndClickButtonBy(SELLERS);
    }
}
