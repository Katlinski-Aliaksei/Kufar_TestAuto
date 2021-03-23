package tests;

import core.InitialDriver;
import elements.Buttons;
import elements.Elements;
import enums.Credentials;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import pages.Profile;
import pages.SomeScreen;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SettingsPageTests {
    SomeScreen someScreen=new SomeScreen(InitialDriver.getDriver());
    Elements elements=new Elements();
    Profile profile=new Profile(InitialDriver.getDriver());
    Buttons buttons=new Buttons();

    @Before
    public void setCap() throws MalformedURLException {
        someScreen.logIn(Credentials.ALEKSEI_EMAIL.getType(), Credentials.ALEKSEI_PASS.getType());
    }
    @Test
    public void languageMenuTest(){
        profile.openSettings();
        profile.clickDropButtonLanguage();
        Assertions. assertAll(
                () -> assertEquals(profile.checkRusLang(),"Русский"),
                () -> assertEquals(profile.checkBelLang(),"Беларуская")
        );
        profile.clickClose();
        profile.clickBackButton();
    }

    @Test
    public void checkSelectLanguageTest() throws InterruptedException {
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



    @After
    public void logOut(){
        someScreen.logOut();

    }
}
