package pages.profile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Settings extends BasePage {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")
    private WebElement MY_PAY_CARDS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElement MY_DATA;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView")
    private WebElement KUFAR_PAYMENT;
    @AndroidFindBy(id = "se.scmv.belarus:id/addCard")
    private WebElement ADD_NEW_CARDS_BUTTON;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
    private WebElement NUMBER_CARD_FIELD;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.EditText")
    private WebElement OWNER_NAME_FIELD;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText")
    private WebElement VALIDITY_CARD_FIELD;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText")
    private WebElement CVC_FIELD;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.widget.Button")
    private WebElement ADD_CARD_BUTTON;


    public Settings(AndroidDriver driver) {

        super(driver);
    }

    public void clickMyPayCardsButton() {
        buttons.searchAndClickButtonBy(MY_PAY_CARDS);
    }

    public void clickMyDataButton() {
        buttons.searchAndClickButtonBy(MY_DATA);
    }

    public void clickKufarPaymentButton() {
        buttons.searchAndClickButtonBy(KUFAR_PAYMENT);
    }

    public boolean checkAddNewCardButton() {
        return elements.isVisibleElement(ADD_NEW_CARDS_BUTTON);
    }


    public void clickAddNewCardButton() {
        buttons.searchAndClickButtonBy(ADD_NEW_CARDS_BUTTON);
    }

    public boolean checkNumberCardField() {
        return elements.isVisibleElement(NUMBER_CARD_FIELD);
    }

    public boolean checkOwnerNameField() {
        return elements.isVisibleElement(OWNER_NAME_FIELD);
    }

    public boolean checkValidityCardField() {
        return elements.isVisibleElement(VALIDITY_CARD_FIELD);
    }

    public boolean checkCvcField() {
        return elements.isVisibleElement(CVC_FIELD);
    }

    public boolean checkAddCardButton() {
        return elements.isVisibleElement(ADD_CARD_BUTTON);
    }
}
