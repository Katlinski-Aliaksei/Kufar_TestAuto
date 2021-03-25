package tests.profilePageTests;

import core.InitialDriver;
import elements.Buttons;
import elements.Elements;
import enums.Credentials;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.profile.Profile;
import pages.SomeScreen;

public class SettingsPageTests {
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());
    Elements elements = new Elements();
    Profile profile = new Profile(InitialDriver.getDriver());
    Buttons buttons = new Buttons();

    @BeforeMethod
    public void setCap() {
        someScreen.logIn(Credentials.EMAIL.getType(), Credentials.PASS.getType());
    }

    @Test
    public void languageMenuTest() {
        SoftAssert softAssertion = new SoftAssert();
        profile.openSettings();
        profile.clickDropButtonLanguage();
        softAssertion.assertEquals(profile.checkRusLang(), "Русский");
        softAssertion.assertEquals(profile.checkBelLang(), "Беларуская");
        softAssertion.assertAll();
        profile.clickClose();
        profile.clickBackButton();
    }

    @Test
    public void checkSelectLanguageTest() {
        profile.openSettings();
        profile.clickDropButtonLanguage();
        profile.setBelLanguage();
        profile.clickDropButtonLanguage();
        Assert.assertTrue(profile.isSelectedBelLang());
        profile.setRusLanguage();
        profile.clickDropButtonLanguage();
        Assert.assertTrue(profile.isSelectedRusLang());
        profile.clickClose();
        profile.clickBackButton();
    }

    @AfterMethod
    public void logOut() {
        someScreen.logOut();
    }
}
