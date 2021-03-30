package tests.profilePageTests;

import core.InitialDriver;
import enums.Credentials;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SomeScreen;
import pages.profile.Profile;
import pages.profile.Settings;

public class MyPayCardsTest {
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());
    Settings settings = new Settings(InitialDriver.getDriver());
    Profile profile = new Profile(InitialDriver.getDriver());

    @BeforeTest
    public void setCap() {
        someScreen.logIn(Credentials.EMAIL.getType(), Credentials.PASS.getType());
    }

    @Test
    @Owner("Katlinski Aliaksei")
    public void registrationNewCardTest() throws InterruptedException {
        profile.openSettings();
        settings.clickMyPayCardsButton();
        Assert.assertTrue(settings.checkAddNewCardButton());
        profile.clickBackButton();
        profile.clickBackButton();
    }

    @Test
    @Owner("Katlinski Aliaksei")
    public void addCardDataTest() throws InterruptedException {
        SoftAssert softAssertion = new SoftAssert();
        profile.openSettings();
        settings.clickMyPayCardsButton();
        settings.clickAddNewCardButton();
        softAssertion.assertTrue(settings.checkValidityCardField());
        softAssertion.assertTrue(settings.checkOwnerNameField());
        softAssertion.assertTrue(settings.checkNumberCardField());
        softAssertion.assertTrue(settings.checkCvcField());
        softAssertion.assertTrue(settings.checkAddCardButton());
        softAssertion.assertAll();
        profile.clickBackButton();
        profile.clickBackButton();
        profile.clickBackButton();
    }

    @AfterTest
    public void logOut() {
        someScreen.logOut();
    }
}
