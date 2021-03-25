package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SomeScreen extends BasePage {
    @AndroidFindBy(id = "se.scmv.belarus:id/menu_profile")
    private WebElement PROFILE_BUTTON;
    @AndroidFindBy(id = "se.scmv.belarus:id/login")
    private WebElement LOGIN_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement CLOSE_BUTTON;
    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    private WebElement CANCEL_BUTTON;//кнопка "ничего из перечисленного" всплывающее окно
    @AndroidFindBy(id = "se.scmv.belarus:id/avatar")
    private WebElement AVATAR_BUTTON;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.TextView")
    private WebElement LOGOUT_BUTTON;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]")
    private WebElement BACK_BUTTON_PROFILE;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement EMAIL_PATH;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement PASSWORD_PATH;

    public SomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public void logIn(String email, String password) {
        goToLoginProcess();
        compelledLogIn();
        enterCredentialsAndLogin(email, password);
        goToMyData();
    }

    public void logOut() {
        buttons.searchAndClickButtonBy(PROFILE_BUTTON);
        buttons.searchAndClickButtonBy(AVATAR_BUTTON);
        screen.scrollablePage("Выйти");
        buttons.searchAndClickButtonBy(LOGOUT_BUTTON);
    }

    public void compelledLogIn() {
        buttons.searchAndClickButtonBy(CANCEL_BUTTON);
    }

    public void enterCredentialsAndLogin(String email, String password) {
        elements.searchFieldAndSendKey(EMAIL_PATH, email);
        elements.searchFieldAndSendKey(PASSWORD_PATH, password);
        buttons.searchAndClickButtonBy(LOGIN_BUTTON);
    }

    private void goToMyData() {
        buttons.searchAndClickButtonBy(AVATAR_BUTTON);
        buttons.searchAndClickButtonBy(BACK_BUTTON_PROFILE);
    }

    private void goToLoginProcess() {
        buttons.searchAndClickButtonBy(PROFILE_BUTTON);
        buttons.searchAndClickButtonBy(PROFILE_BUTTON);
        buttons.searchAndClickButtonBy(LOGIN_BUTTON);
    }
}
