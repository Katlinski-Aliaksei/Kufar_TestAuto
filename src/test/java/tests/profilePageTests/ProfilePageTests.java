package tests.profilePageTests;

import core.InitialDriver;
import enums.Credentials;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SomeScreen;
import pages.profile.Profile;


public class ProfilePageTests {
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());
    Profile profile = new Profile(InitialDriver.getDriver());

    @BeforeTest
    public void setCap() {
        someScreen.logIn(Credentials.EMAIL.getType(), Credentials.PASS.getType());
    }

    @Test
    @Owner("Katlinski Aliaksei")
    public void isVisibleADTest() {
        Assert.assertTrue(profile.visibleElementAD());
    }

    @Test
    @Owner("Katlinski Aliaksei")
    public void haveTextADTest() {
        Assert.assertEquals(profile.haveTextAD(), "Мои объявления");
    }

    @Test
    @Owner("Katlinski Aliaksei")
    public void isVisibleSettingsTest() {
        Assert.assertTrue(profile.visibleElementSettings());
    }

    @Test
    @Owner("Katlinski Aliaksei")
    public void haveTextSettingTest() {
        Assert.assertEquals(profile.haveTextSettings(), "Настройки");
    }

    @AfterTest
    public void logOut() {
        someScreen.logOut();
    }
}
