package tests.favorites;

import core.InitialDriver;
import enums.Credentials;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Favorites;
import pages.SomeScreen;
import pages.advertisements.Advertisements;
import pages.advertisements.Filters;

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
    public void When_SaveFavoriteSearch_Then_ThisSearchIsVisibleInFavorites() {
        chooseTypesOfCategory();
        goToFavoriteSearch();

        String actualResult = favorites.getNameOfFavoriteSearch();
        boolean isContainsSearch = actualResult.contains(expectedNameOfSearch);

        Assert.assertTrue(isContainsSearch);
    }

    @Test(dependsOnMethods = "When_SaveFavoriteSearch_Then_ThisSearchIsVisibleInFavorites")
    public void When_DeleteFavoriteSearch_Then_HeRemoving() {
        favorites.deleteAdvertFromFavoriteAds();
        Assert.assertTrue(favorites.isNotVisibleSearchInFavorites());
    }

    private void chooseTypesOfCategory() {
        filters.goToAdvertisements();
        filters.goToFiltersMenu();
        filters.chooseApartmentCategory();
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
