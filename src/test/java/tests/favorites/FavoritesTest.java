package tests.favorites;

import core.InitialDriver;
import enums.Credentials;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Favorites;
import pages.SomeScreen;
import pages.advertisements.Advert;
import pages.advertisements.Advertisements;

public class FavoritesTest {
    Favorites favorites = new Favorites(InitialDriver.getDriver());
    Advertisements advertisements = new Advertisements(InitialDriver.getDriver());
    Advert advert = new Advert(InitialDriver.getDriver());
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());

    @BeforeTest
    public void logIn() {
        favorites.signInOrLogin();
        someScreen.compelledLogIn();
        someScreen.enterCredentialsAndLogin(Credentials.EMAIL.getType(), Credentials.PASS.getType());
    }

    @Test
    public void When_AdvertAddToFavorites_Then_TheirTitlesEquals() {
        advertisements.goToAdvertisements();
        advertisements.goToFirstAdvert();
        advert.addAdToFavorites();
        String expectedAdTitle = advert.getAdTitle();
        advert.goBack();
        advertisements.goToFavorites();
        String actualAdTitle = favorites.getAdTitleInFavorite();

        Assert.assertEquals(expectedAdTitle, actualAdTitle);
    }

    @Test
    public void When_UserUnlikedAdvertisement_Then_AdsRemoved() {
        Assert.assertFalse(favorites.isTakeAwayAdsFromFavorites());
    }

    @AfterTest
    public void logOut() {
        someScreen.logOut();
    }
}
