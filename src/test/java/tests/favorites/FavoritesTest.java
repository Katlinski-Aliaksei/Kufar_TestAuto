package tests.favorites;

import core.InitialDriver;
import enums.Credentials;
import org.junit.Assert;
import org.junit.Test;
import pages.Advert;
import pages.Advertisements;
import pages.Favorites;
import pages.SomeScreen;

public class FavoritesTest {
    Favorites favorites = new Favorites(InitialDriver.getDriver());
    Advertisements advertisements = new Advertisements(InitialDriver.getDriver());
    Advert advert = new Advert(InitialDriver.getDriver());
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());

    @Test
    public void When_AdvertAddToFavorites_Then_TheirTitlesEquals() {
        favorites.signInOrLogin();
        someScreen.compelledLogIn();
        someScreen.enterCredentialsAndLogin(Credentials.VADYM_EMAIL.getType(), Credentials.VADYM_PASS.getType());

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
}
