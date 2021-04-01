package tests.favorites;

import core.InitialDriver;
import enums.Credentials;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SomeScreen;
import pages.advertisements.Advert;
import pages.advertisements.Advertisements;
import pages.favorites.Favorites;

public class FavoritesSellersTest {
    Favorites favorites = new Favorites(InitialDriver.getDriver());
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());
    Advert advert = new Advert(InitialDriver.getDriver());
    Advertisements advertisements = new Advertisements(InitialDriver.getDriver());

    @BeforeTest
    public void logIn() {
        favorites.signInOrLogin();
        someScreen.compelledLogIn();
        someScreen.enterCredentialsAndLogin(Credentials.EMAIL.getType(), Credentials.PASS.getType());
    }

    @Test
    @Owner(value = "Vadym Sula")
    @Description("Check on success following on seller and conformity his name before/after follow")
    public void followingOnSeller() {
        advertisements.goToAdvertisements();
        advertisements.goToFirstAdvert();
        advert.goToSellerInfo();
        String expectedNameOfSeller = advert.getNameOfSeller();
        advert.followOnSeller();
        advert.goBack();
        advertisements.goToFavorites();
        favorites.chooseSellersSection();

        String actualNameOfSeller = favorites.getNameOfSeller();
        Assert.assertEquals(expectedNameOfSeller, actualNameOfSeller);
    }

    @Test
    @Owner(value = "Vadym Sula")
    @Description("Check on success unfollowing from seller")
    public void unfollowFromSeller() {
        favorites.unfollowOfSeller();

        Assert.assertTrue(favorites.isNotVisibleSellerInFavorites());
    }

    @AfterTest
    public void logOut() {
        someScreen.logOut();
    }
}
