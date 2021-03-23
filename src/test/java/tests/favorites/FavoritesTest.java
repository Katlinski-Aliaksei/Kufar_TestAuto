package tests.favorites;

import core.InitialDriver;
import enums.Credentials;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.Favorites;
import pages.SomeScreen;

public class FavoritesTest {
    Favorites favorites = new Favorites(InitialDriver.getDriver());
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());

    @Before
    public void signUpOrLogin() {
        favorites.signInOrLogin();
        someScreen.compelledLogIn();
        someScreen.enterCredentialsAndLogin(Credentials.VADYM_EMAIL.getType(), Credentials.VADYM_PASS.getType());
    }

    @Test
    public void When_UserUnlikedAdvertisement_Then_AdsRemoved() {
        Assert.assertFalse(favorites.isTakeAwayAdsFromFavorites());
    }
}
