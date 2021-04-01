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
import pages.advertisements.Advertisements;
import pages.advertisements.Filters;
import pages.favorites.Favorites;

public class FavoritesSearchTest {
    private String expectedNameOfSearch;
    Favorites favorites = new Favorites(InitialDriver.getDriver());
    Advertisements advertisements = new Advertisements(InitialDriver.getDriver());
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());
    Filters filters = new Filters(InitialDriver.getDriver());

    @BeforeTest
    public void logIn() {
        favorites.signInOrLogin();
        someScreen.compelledLogIn();
        someScreen.enterCredentialsAndLogin(Credentials.EMAIL.getType(), Credentials.PASS.getType());
    }

    @Test
    @Owner(value = "Vadym Sula")
    @Description("Check on existence Search in favorites")
    public void saveFavoriteSearch() {
        chooseTypesOfCategory();
        goToFavoriteSearch();

        String actualResult = favorites.getNameOfFavoriteSearch();
        boolean isContainsSearch = actualResult.contains(expectedNameOfSearch);

        Assert.assertTrue(isContainsSearch);
    }

    @Test(dependsOnMethods = "saveFavoriteSearch")
    @Owner(value = "Vadym Sula")
    @Description("Check on success removing search from favorites")
    public void deleteSearchFromFavorites() {
        favorites.deleteSearchFromFavorites();
        Assert.assertTrue(favorites.isNotVisibleSearchInFavorites());
    }

    @AfterTest
    public void logOut() {
        someScreen.logOut();
    }

    private void chooseTypesOfCategory() {
        filters.goToAdvertisements();
        filters.goToFiltersMenu();
        filters.chooseImmovabilityCategory();
        expectedNameOfSearch = filters.getTypeOfSection();
        filters.chooseApartmentSection();
    }

    private void goToFavoriteSearch() {
        filters.saveSearch();
        filters.closeFilters();
        advertisements.goToFavorites();
        favorites.chooseSearchSection();
    }
}
