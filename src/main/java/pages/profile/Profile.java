package pages.profile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Profile extends BasePage {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView")
    private WebElement AD;
    //Мои заказы
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")
    private WebElement ORDERS;
    //Уведомления
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView")
    private WebElement NOTIFICATION;
    //Пакеты обновлений
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView")
    private WebElement UPDATE_PACKAGE;
    //Настройки
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.TextView")
    private WebElement SETTINGS;

    //Локаторы меню настройки
    @AndroidFindBy(id = "se.scmv.belarus:id/icon")
    private WebElement LANGUAGE_DROP_WINDOW;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
    private WebElement RUS_LANGUAGE;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
    private WebElement BEL_LANGUAGE;
    @AndroidFindBy(id = "se.scmv.belarus:id/close")
    private WebElement CLOSE_BUTTON;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]")
    private WebElement BACK_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RadioButton")
    private WebElement BEL_CHECKBOX;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RadioButton")
    private WebElement RUS_CHECKBOX;

    public Profile(AndroidDriver driver) {
        super(driver);
    }

    public String haveTextAD() {

        return elements.getTextFromElement(AD);
    }

    public boolean visibleElementAD() {

        return elements.isVisibleElement(AD);
    }

    public String haveTextSettings() {

        return elements.getTextFromElement(SETTINGS);
    }

    public boolean visibleElementSettings() {

        return elements.isVisibleElement(SETTINGS);
    }

    public void openSettings() {
        buttons.searchAndClickButtonBy(SETTINGS);
    }

    public void clickDropButtonLanguage() {
        buttons.searchAndClickButtonBy(LANGUAGE_DROP_WINDOW);
    }

    public String checkRusLang() {
        return elements.getTextFromElement(RUS_LANGUAGE);
    }

    public void setBelLanguage() {
        buttons.searchAndClickButtonBy(BEL_LANGUAGE);
    }

    public void setRusLanguage() {
        buttons.searchAndClickButtonBy(RUS_LANGUAGE);
    }

    public String checkBelLang() {
        return elements.getTextFromElement(BEL_LANGUAGE);
    }

    public boolean isSelectedBelLang() {
        return elements.isSelectedElement(BEL_CHECKBOX);
    }

    public boolean isSelectedRusLang() {
        return elements.isSelectedElement(RUS_CHECKBOX);
    }


    public void clickClose() {
        buttons.searchAndClickButtonBy(CLOSE_BUTTON);
    }

    public void clickBackButton() {
        buttons.searchAndClickButtonBy(BACK_BUTTON);
    }

    public void clickMenuProfileButton() {
        buttons.searchAndClickButtonBy(MENU_PROFILE);
    }
}
