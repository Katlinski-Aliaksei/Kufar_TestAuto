package tests.advertTests;

import core.InitialDriver;
import enums.Credentials;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SomeScreen;
import pages.advert.Advert;
import pages.profile.Profile;

public class AdvertTests {
    Profile profile = new Profile(InitialDriver.getDriver());
    Advert advert = new Advert(InitialDriver.getDriver());
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());

    @BeforeTest
    public void setCap() {
        someScreen.logIn(Credentials.EMAIL.getType(), Credentials.PASS.getType());
    }

    @Test
    public void addNewAdvertHuaweiForSaleTest() {
        advert.addNewAdvertHuaweiPhoneForSale();
        profile.clickBackButton();
        profile.clickMenuProfileButton();
        profile.clickMyAdvertsMenu();
        Assert.assertTrue(advert.checkHuaweiAdvertInModeration()
                || advert.checkHuaweiAdvertIsActive());
        profile.clickBackButton();
    }

    @AfterTest
    public void logOut() {
        someScreen.logOut();
    }
}
