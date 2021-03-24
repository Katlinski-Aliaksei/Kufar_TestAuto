package tests;

import core.InitialDriver;
import elements.Buttons;
import elements.Elements;
import enums.Credentials;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.Profile;
import pages.SomeScreen;

public class SettingsPageTests {
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());
    Elements elements = new Elements();
    Profile profile = new Profile(InitialDriver.getDriver());
    Buttons buttons = new Buttons();

    @BeforeTest
    public void setCap() {
        someScreen.logIn(Credentials.ALEKSEI_EMAIL.getType(), Credentials.ALEKSEI_PASS.getType());
    }

    @Test
    public void languageMenuTest() {
        SoftAssert softAssertion= new SoftAssert();
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

    @AfterTest
    public void logOut() {
        someScreen.logOut();
    }
}
