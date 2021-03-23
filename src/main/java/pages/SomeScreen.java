package pages;

import elements.Buttons;
import elements.Elements;
import elements.Screen;
import org.openqa.selenium.By;

public class SomeScreen {

    Buttons buttons = new Buttons();
    Screen screen = new Screen();
    Elements elements = new Elements();

    private By PROFILE_BUTTON = By.id("se.scmv.belarus:id/menu_profile");
    private By LOGIN_BUTTON = By.id("se.scmv.belarus:id/login");
    private By CANCEL_BUTTON = By.id("com.google.android.gms:id/cancel");//кнопка "ничего из перечисленного" всплывающее окно
    private By AVATAR_BUTTON = By.id("se.scmv.belarus:id/avatar");
    private By LOGOUT_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.TextView");
    //LOGOUT_BUTTON кнопка выйти из профиля
    private By BACK_BUTTON_PROFILE = By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]");
    //кнопка назад из меню Мои данные(при нажатии на аватар)


    private By EMAIL_PATH = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    private By PASSWORD_PATH = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    private String Email = "katlinskiialeks@gmail.com";
    private String Password = "192966804Kat";


    public void logIn() {
       goToLoginProcess();
       compelledLogIn();
       //Кнопка ничего из предложенного всплывающее окно перед вводом логин\пароль
       //в эмуляторе не появляется,в реальном девайсе есть
       enterCredentialsAndLogin();
       goToMyData();

    }

    public void logOut() {
        buttons.searchAndClickButtonById(PROFILE_BUTTON);
        buttons.searchAndClickButtonById(AVATAR_BUTTON);
        screen.scrollablePage("Выйти");
        buttons.searchAndClickButtonByXPath(LOGOUT_BUTTON);

    }

    public void compelledLogIn() {
        buttons.searchAndClickButtonById(CANCEL_BUTTON);
    }

    public void enterCredentialsAndLogin() {
        buttons.searchAndClickButtonByXPath(EMAIL_PATH).sendKeys(Email);
        buttons.searchAndClickButtonByXPath(PASSWORD_PATH).sendKeys(Password);
        buttons.clickButtonBackOnKeyboard();
        buttons.searchAndClickButtonById(LOGIN_BUTTON);
    }

    private void goToMyData() {
        buttons.searchAndClickButtonById(AVATAR_BUTTON);
        buttons.searchAndClickButtonByXPath(BACK_BUTTON_PROFILE);
    }
    private void goToLoginProcess() {
        buttons.searchAndClickButtonById(PROFILE_BUTTON);
        buttons.searchAndClickButtonById(PROFILE_BUTTON);
        buttons.searchAndClickButtonById(LOGIN_BUTTON);
    }
}
