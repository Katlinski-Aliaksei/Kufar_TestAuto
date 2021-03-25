package pages.advertisements;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Advertisements extends BasePage {
    @AndroidFindBy(id = "se.scmv.belarus:id/menu_listing")
    private WebElement ADS;
    @AndroidFindBy(id = "se.scmv.belarus:id/filtersButton")
    private WebElement FILTERS_BUTTON;
    @AndroidFindBy(id = "se.scmv.belarus:id/menu_filters")
    private WebElement MENU_FILTERS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout[1]/android.widget.ViewAnimator/android.view.ViewGroup/android.view.ViewGroup/android.widget" +
            ".ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view" +
            ".ViewGroup/android.widget.FrameLayout/android.widget.CheckBox")
    private WebElement LIKE_OF_FIRST_ELEMENT;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.view" +
            ".ViewGroup/android.view.ViewGroup/android.widget.ViewAnimator/androidx.recyclerview.widget" +
            ".RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup")
    private WebElement FIRST_ELEMENT_OF_ADS;

    public Advertisements(AndroidDriver driver) {
        super(driver);
    }

    public void goToAdvertisements() {
        buttons.searchAndClickButtonBy(MENU_LISTING);
    }

    public void goToFirstAdvert() {
        buttons.searchAndClickButtonBy(FIRST_ELEMENT_OF_ADS);
    }

    public void goToFavorites() {
        buttons.searchAndClickButtonBy(MENU_FAVORITES);
    }

    public void goToFiltersMenu() {
        buttons.searchAndClickButtonBy(MENU_FILTERS);
    }
}
