package pages;

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

    public boolean isTakeAwayAdsFromFavorites() {
        goToFavorites();
        buttons.searchAndClickButtonBy(IS_FAVORITE);
        screen.swipeFromUpToBottom();

        return elements.isNotVisibleElement(ADS_FAVORITE);
    }

    public void goToFavorites() {
        buttons.searchAndClickButtonBy(MENU_FAVORITES);
    }

    public String getAdTitleInFavorite() {
        return elements.getTextFromElement(TITLE_FAVORITE_SEARCH);
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
