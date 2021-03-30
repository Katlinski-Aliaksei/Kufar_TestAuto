package pages;

import enums.Direction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Favorites extends BasePage {
    @AndroidFindBy(id = "se.scmv.belarus:id/menu_favorites")
    private WebElement MENU_FAVORITES;
    @AndroidFindBy(id = "se.scmv.belarus:id/login")
    private WebElement SIGN_IN_OR_LOGIN;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Объявления\"]/android.widget.LinearLayout")
    private WebElement ADVERTISEMENT;
    @AndroidFindBy(accessibility = "Поиски")
    private WebElement SEARCH_FAVORITES;
    @AndroidFindBy(accessibility = "Продавцы")
    private WebElement SELLERS;
    @AndroidFindBy(id = "se.scmv.belarus:id/subject")
    private WebElement TITLE_FAVORITE_SEARCH;
    @AndroidFindBy(id = "se.scmv.belarus:id/favoriteContainer")
    private WebElement IS_FAVORITE;
    @AndroidFindBy(id = "se.scmv.belarus:id/name")
    private WebElement SELLER_NAME;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup")
    private WebElement ADS_FAVORITE;
    @AndroidFindBy(id = "se.scmv.belarus:id/delete")
    private WebElement DELETE_ADVERT_FROM_FAVORITE_ADS;
    @AndroidFindBy(id = "se.scmv.belarus:id/title")
    private WebElement NAME_TITLE_OF_FAVORITE_SEARCH;
    @AndroidFindBy(id = "android:id/button1")
    private WebElement CONFIRM_DELETE;

    public Favorites(AndroidDriver driver) {
        super(driver);
    }

    public void signInOrLogin() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        goToFavorites();
        buttons.searchAndClickButtonBy(SIGN_IN_OR_LOGIN);
    }

    public boolean isNotVisibleAdsInFavorites() {
        goToFavorites();
        buttons.searchAndClickButtonBy(IS_FAVORITE);
        screen.swipe(Direction.DOWN);

        return elements.isNotVisibleElement(ADS_FAVORITE);
    }

    public void goToFavorites() {
        buttons.searchAndClickButtonBy(MENU_FAVORITES);
    }

    public String getAdTitleInFavorite() {
        return elements.getTextFromElement(TITLE_FAVORITE_SEARCH);
    }

    public void chooseAdsSection() {
        buttons.searchAndClickButtonBy(ADVERTISEMENT);
    }

    public void chooseSearchSection() {
        buttons.searchAndClickButtonBy(SEARCH_FAVORITES);
        screen.swipe(Direction.DOWN);

    }

    public String getNameOfFavoriteSearch() {
        return elements.getTextFromElement(NAME_TITLE_OF_FAVORITE_SEARCH);
    }

    public void deleteAdvertFromFavoriteAds() {
        buttons.searchAndClickButtonBy(DELETE_ADVERT_FROM_FAVORITE_ADS);
        buttons.searchAndClickButtonBy(CONFIRM_DELETE);
    }

    public boolean isNotVisibleSearchInFavorites() {
        return elements.isNotVisibleElement(DELETE_ADVERT_FROM_FAVORITE_ADS);
    }

    public void chooseSellersSection() {
        buttons.searchAndClickButtonBy(SELLERS);
    }
}
