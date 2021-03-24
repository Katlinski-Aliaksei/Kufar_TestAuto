package pages.advertisements;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Filters extends BasePage {

    @AndroidFindBy(id = "se.scmv.belarus:id/search")
    private WebElement SEARCH_FIELD;
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
    private WebElement NAME_OF_SECTION;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    private WebElement REGION_FIELD;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget" +
            ".RecyclerView/android.widget.FrameLayout[2]")
    private WebElement FIRST_VARIANT_OF_REGIONS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget" +
            ".RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView")
    private WebElement NAME_OF_FIRST_VARIANT_REGION;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget" +
            ".RecyclerView/android.widget.FrameLayout[2]")
    private WebElement FIRST_VARIANT_OF_AREA;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget" +
            ".RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView")
    private WebElement NAME_OF_FIRST_VARIANT_AREA;
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
    private WebElement APPLY_PRICE_BUTTON;
    public Filters(AndroidDriver driver) {
        super(driver);
    }
}
