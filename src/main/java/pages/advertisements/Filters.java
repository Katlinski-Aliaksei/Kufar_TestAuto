package pages.advertisements;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Filters extends BasePage {

    @AndroidFindBy(id = "se.scmv.belarus:id/search")
    private WebElement SEARCH_FIELD;
    @AndroidFindBy(id = "se.scmv.belarus:id/searchFiltersButton")
    private WebElement FILTERS_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view" +
            ".ViewGroup/android.widget.CheckBox")
    private WebElement SEARCH_ONLY_IN_TITLES_CHECKBOX;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private WebElement CATEGORIES_LIST;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget" +
            ".ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
    private WebElement IMMOVABILITY_CATEGORY;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget" +
            ".ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
    private WebElement APARTMENT_SECTION;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget" +
            ".ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView")
    private WebElement TYPE_OF_SECTION;
    @AndroidFindBy(id = "se.scmv.belarus:id/filter_menu_apply")
    private WebElement FILTER_MENU_APPLY_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    private WebElement PRICE_FIELD;
    @AndroidFindBy(id = "se.scmv.belarus:id/inputFrom")
    private WebElement PRICE_FROM;
    @AndroidFindBy(id = "se.scmv.belarus:id/inputTo")
    private WebElement PRICE_TO;
    @AndroidFindBy(id = "se.scmv.belarus:id/apply")
    private WebElement APPLY_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]")
    private WebElement COUNT_OF_ROOMS_SELECT;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    private WebElement FIRST_VARIANT_OF_COUNT_ROOMS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget" +
            ".LinearLayout[1]/android.widget.TextView")
    private WebElement COUNT_OF_ROOMS_TEXT;
    @AndroidFindBy(id = "se.scmv.belarus:id/showAdverts")
    private WebElement SHOW_ADVERTS_BUTTON;
    @AndroidFindBy(id = "se.scmv.belarus:id/listingButton")
    private WebElement LISTING_VIEW_BUTTON;

    public Filters(AndroidDriver driver) {
        super(driver);
    }

    public void goToAdvertisements() {
        buttons.searchAndClickButtonBy(MENU_LISTING);
    }

    public void goToFiltersMenu() {
        buttons.searchAndClickButtonBy(FILTERS_BUTTON);
    }

    public void goToMenuProfile() {
        buttons.searchAndClickButtonBy(MENU_PROFILE);
    }

    public void chooseApartmentCategory() {
        buttons.searchAndClickButtonBy(CATEGORIES_LIST);
        buttons.searchAndClickButtonBy(IMMOVABILITY_CATEGORY);
    }

    public String getTypeOfSection() {
        return elements.getTextFromElement(TYPE_OF_SECTION);
    }

    public void inputPriceFromTo(String priceFrom, String priceTo) {
        buttons.searchAndClickButtonBy(APARTMENT_SECTION);
        buttons.searchAndClickButtonBy(PRICE_FIELD);
        elements.searchFieldAndSendKey(PRICE_FROM, priceFrom);
        elements.searchFieldAndSendKey(PRICE_TO, priceTo);
        clickOnApply();
    }

    public void chooseCountOfRooms() {
        buttons.searchAndClickButtonBy(COUNT_OF_ROOMS_SELECT);
        buttons.searchAndClickButtonBy(FIRST_VARIANT_OF_COUNT_ROOMS);
    }

    public String getCountOfRooms() {
        return elements.getTextFromElement(COUNT_OF_ROOMS_TEXT);
    }

    public void clickOnApply() {
        buttons.searchAndClickButtonBy(APPLY_BUTTON);
    }

    public void showAdvertsAfterFilters() {
        buttons.searchAndClickButtonBy(SHOW_ADVERTS_BUTTON);
    }

    public void goToListingViewResults() {
        buttons.searchAndClickButtonBy(LISTING_VIEW_BUTTON);
    }
}
