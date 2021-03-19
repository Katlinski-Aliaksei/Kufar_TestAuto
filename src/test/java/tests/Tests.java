package tests;

import core.AndroidOptions;
import core.InitialDriver;
import elements.Buttons;
import elements.Elements;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebElement;
import pages.Profile;
import pages.SomeScreen;

import java.net.MalformedURLException;


public class Tests {
    SomeScreen someScreen=new SomeScreen();
    Elements elements=new Elements();
    Profile profile=new Profile();



    @Before
    public void setCap() throws MalformedURLException {
      //  initialDriver.;
        someScreen.logIn();
    }

    @Test
    public void isVisibleADTest() {
        Assert.assertTrue(profile.visibleElementAD());
    }

    @Test
    public void haveTextADTest(){
        Assert.assertTrue(profile.haveTextAD());
    }


    @After
    public void logOut(){

        someScreen.logOut();
    }
}
