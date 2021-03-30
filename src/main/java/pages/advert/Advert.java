package pages.advert;

import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.profile.Profile;

public class Advert extends BasePage {

    Profile profile = new Profile(InitialDriver.getDriver());
    @AndroidFindBy(id = "se.scmv.belarus:id/edittext")
    private WebElement TITLE;
    @AndroidFindBy(id = "se.scmv.belarus:id/select")
    private WebElement CATEGORIES;
    @AndroidFindBy(xpath = "/hierarchy//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]")
    private WebElement TELEPHONES_AND_TABLETS;
    @AndroidFindBy(xpath = "/hierarchy//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    private WebElement MOBILE_PHONES;
    @AndroidFindBy(xpath = "/hierarchy//android.view.ViewGroup[3]/android.widget.ImageView")
    private WebElement MANUFACTURER_DROPDOWN_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[11]")
    private WebElement HUAWEI_PHONE;
    @AndroidFindBy(xpath = "/hierarchy//android.view.ViewGroup[4]/android.widget.ImageView")
    private WebElement MODEL_DROPDOWN_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
    private WebElement ENJOY_10_PLUS;
    @AndroidFindBy(xpath = "/hierarchy//android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.CompoundButton[1]")
    private WebElement ANDROID_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.CompoundButton[3]")
    private WebElement DIAGONAL;
    @AndroidFindBy(xpath = "/hierarchy//android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.CompoundButton[3]")
    private WebElement MEMORY_32;
    @AndroidFindBy(xpath = "/hierarchy//android.widget.LinearLayout[6]/android.view.ViewGroup/android.widget.CheckBox")
    private WebElement SLOT_MEMORY_CARD;
    @AndroidFindBy(xpath = "//android.widget.CompoundButton[contains(@text, 'Б/у')]")
    private WebElement USED_BUTTON;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Цена')]")
    private WebElement PRICE_FIELD;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Описание, Обязательное поле')]")
    private WebElement DESCRIPTION_FIELD;
    @AndroidFindBy(id = "se.scmv.belarus:id/textinput_placeholder")
    private WebElement PHONE_NUMBER_FIELD;
    @AndroidFindBy(id = "se.scmv.belarus:id/apply")
    private WebElement FINISH_BUTTON_ADD_ADVERT;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Huawei')]")
    private WebElement HUAWEI_ADVERT_TITLE;
    @AndroidFindBy(xpath = "/hierarchy//android.widget.FrameLayout[2]/android.widget.Button")
    private WebElement CONTROL_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy//android.widget.LinearLayout[2]")
    private WebElement DEACTIVATE_BUTTON;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Передумал(а) продавать')]")
    private WebElement NO_SALE_CHECKBOX;
    @AndroidFindBy(id = "se.scmv.belarus:id/deactivate")
    private WebElement DEACTIVATE_ADVERT_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy//android.widget.LinearLayout[3]/android.widget.LinearLayout")
    private WebElement MODERATION_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy//android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private WebElement ACTIVE_BUTTON;

    public Advert(AndroidDriver driver) {
        super(driver);
    }

    public void clickAddAdvert() {
        buttons.searchAndClickButtonBy(ADD_ADVERT);
    }

    public void setTitle(String title) {
        elements.searchFieldAndSendKey(TITLE, title);
    }

    public void setCategories(WebElement highElement, WebElement lowElement) {
        buttons.searchAndClickButtonBy(CATEGORIES);
        buttons.searchAndClickButtonBy(highElement);
        buttons.searchAndClickButtonBy(lowElement);
    }

    public void setManufacturer(WebElement manufacturer) {
        buttons.searchAndClickButtonBy(MANUFACTURER_DROPDOWN_BUTTON);
        buttons.searchAndClickButtonBy(manufacturer);
    }

    public void setModelPhone(WebElement modelPhone) {
        buttons.searchAndClickButtonBy(MODEL_DROPDOWN_BUTTON);
        buttons.searchAndClickButtonBy(modelPhone);
    }

    public void clickAndroidButton() {
        buttons.searchAndClickButtonBy(ANDROID_BUTTON);
    }

    public void setDiagonal() {
        screen.scrollablePage("Поддержка NFC");
        buttons.searchAndClickButtonBy(DIAGONAL);
    }

    public void setMemory() {
        buttons.searchAndClickButtonBy(MEMORY_32);
    }

    public void setMemoryCard() {
        buttons.searchAndClickButtonBy(SLOT_MEMORY_CARD);
    }

    public void clickConditionButton(WebElement condition) {
        screen.scrollablePage("Возможен обмен");
        buttons.searchAndClickButtonBy(condition);
    }

    public void setDescription(String description) {
        elements.searchFieldAndSendKey(DESCRIPTION_FIELD, description);
    }

    public void setPrice(String price) {
        elements.searchFieldAndSendKey(PRICE_FIELD, price);
        //screen.swipeFromUpToBottom();
    }

    public void clickFinishButtonAddAdvert() {
        screen.scrollablePage("Подать объявление");
        buttons.searchAndClickButtonBy(FINISH_BUTTON_ADD_ADVERT);
    }

    public boolean checkHuaweiAdvertInModeration() {
        buttons.searchAndClickButtonBy(MODERATION_BUTTON);
        return elements.isVisibleElement(HUAWEI_ADVERT_TITLE);
    }

    public boolean checkHuaweiAdvertIsActive() {
        buttons.searchAndClickButtonBy(ACTIVE_BUTTON);
        return elements.isVisibleElement(HUAWEI_ADVERT_TITLE);
    }

    public void addNewAdvertHuaweiPhoneForSale() {
        clickAddAdvert();
        setTitle("Huawei");
        setCategories(TELEPHONES_AND_TABLETS, MOBILE_PHONES);
        setManufacturer(HUAWEI_PHONE);
        setModelPhone(ENJOY_10_PLUS);
        clickAndroidButton();
        setDiagonal();
        setMemory();
        setMemoryCard();
        clickConditionButton(USED_BUTTON);
        setDescription("Телефон в хорошем состоянии. Все вопросы в лс.");
        setPrice("200");
        clickFinishButtonAddAdvert();
    }
}
