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



    public boolean haveTextAD() {

        return elements.haveTextElement(AD, "Мои обьявления");
    }
    public boolean visibleElementAD() {

        return elements.isVisibleElement(AD);
    }
}
