package tests;

import core.AndroidOptions;
import elements.Buttons;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class Tests {


    AndroidOptions options=new AndroidOptions();
Buttons elements=new Buttons();

    @Test
    public void clickNumberTest() throws MalformedURLException, InterruptedException {

        //pageElements.getConnect();
        options.getConnect();
        WebElement menuProfile=options.searchButton("se.scmv.belarus:id/menu_profile");
        options.setLoginAndPassword("se.scmv.belarus:id/login");

    }
}
