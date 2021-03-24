package tests;

import core.InitialDriver;
import elements.Elements;
import enums.Credentials;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Profile;
import pages.SomeScreen;


public class ProfilePageTests {
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());
    Elements elements = new Elements();
    Profile profile = new Profile(InitialDriver.getDriver());

    @BeforeTest
    public void setCap() {
        someScreen.logIn(Credentials.EMAIL.getType(), Credentials.PASS.getType());
    }

    @Test
    public void isVisibleADTest() {
        Assert.assertTrue(profile.visibleElementAD());
    }

    @Test
    public void haveTextADTest() {
        Assert.assertEquals(profile.haveTextAD(), "Мои объявления");
    }

    @Test
    public void isVisibleSettingsTest() {
        Assert.assertTrue(profile.visibleElementSettings());
    }

    @Test
    public void haveTextSettingTest() {
        Assert.assertEquals(profile.haveTextSettings(),"Настройки");
    }

    @AfterTest
    public void logOut() {

        someScreen.logOut();
    }
}
