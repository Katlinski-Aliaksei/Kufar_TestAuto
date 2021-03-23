package pages;

import elements.Buttons;
import elements.Elements;
import elements.Screen;
import org.openqa.selenium.By;

public class Profile {

    Buttons buttons = new Buttons();
    Screen screen = new Screen();
    Elements elements = new Elements();

    //Локаторы меню Профиль

    //Мои обьявления
    private By AD = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
    //Мои заказы
    private By ORDERS = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView");
    //Уведомления
    private By NOTIFICATION = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView");
    //Пакеты обновлений
    private By UPDATE_PACKAGE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView");
    //Настройки
    private By SETTINGS = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.TextView");

    //Локаторы меню настройки
    private By LANGUAGE_DROP_WINDOW=By.id("se.scmv.belarus:id/icon");
    private By RUS_LANGUAGE=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
    private By BEL_LANGUAGE=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView");

    private By CLOSE_BUTTON=By.id("se.scmv.belarus:id/close");
    private By BACK_BUTTON = By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]");

    private  By BEL_CHECKBOX=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RadioButton");
    private  By RUS_CHECKBOX=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RadioButton");
    public boolean haveTextAD() {

        return elements.haveTextElement(AD, "Мои обьявления");
    }
    public boolean visibleElementAD() {

        return elements.isVisibleElement(AD);
    }
    public boolean haveTextSettings() {

        return elements.haveTextElement(SETTINGS, "Настройки");
    }
    public boolean visibleElementSettings() {

        return elements.isVisibleElement(SETTINGS);
    }




    public void openSettings(){
        buttons.searchAndClickButtonByXPath(SETTINGS);
    }
    public void clickDropButtonLanguage(){
        buttons.searchAndClickButtonById(LANGUAGE_DROP_WINDOW);
    }
    public String checkRusLang(){
       return elements.getTextByXPath(RUS_LANGUAGE);
    }
    public void setBelLanguage(){
        buttons.searchAndClickButtonByXPath(BEL_LANGUAGE);
    }
    public void setRusLanguage(){
        buttons.searchAndClickButtonByXPath(RUS_LANGUAGE);
    }
    public String checkBelLang(){
        return elements.getTextByXPath(BEL_LANGUAGE);
    }
    public boolean isSelectedBelLang(){
        return elements.isSelectedElement(BEL_CHECKBOX);
    }
    public boolean isSelectedRusLang(){
        return elements.isSelectedElement(RUS_CHECKBOX);
    }


    public void clickClose() {
        buttons.searchAndClickButtonById(CLOSE_BUTTON);
    }
    public void clickBackButton(){
        buttons.searchAndClickButtonByXPath(BACK_BUTTON);
    }
}
