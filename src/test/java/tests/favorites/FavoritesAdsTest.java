package tests.favorites;

import core.InitialDriver;
import enums.Credentials;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SomeScreen;
import pages.advertisements.Advert;
import pages.advertisements.Advertisements;
import pages.favorites.Favorites;

public class FavoritesAdsTest {
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
    @Description("Check on conformity title's added advert to favorites")
    public void addAdvertToFavorites() {
        advertisements.goToAdvertisements();
        advertisements.goToFirstAdvert();
        advert.addAdToFavorites();
        String expectedAdTitle = advert.getAdTitle();
        advert.goBack();
        advertisements.goToFavorites();
        favorites.chooseAdsSection();
        String actualAdTitle = favorites.getAdTitleInFavorite();

        Assert.assertEquals(expectedAdTitle, actualAdTitle);
    }

    @Test(dependsOnMethods = "addAdvertToFavorites")
    @Description("Check on success unlike advert from favorites")
    public void unlikedAdvertFromFavorites() {
        Assert.assertTrue(favorites.isNotVisibleAdsInFavorites());
    }

    @AfterTest
    public void logOut() {
        someScreen.logOut();
    }
}
