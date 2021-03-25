package tests.advertisements;

import core.InitialDriver;
import elements.Elements;
import enums.Credentials;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Profile;
import pages.SomeScreen;
import pages.advertisements.Advert;
import pages.advertisements.Advertisements;
import pages.advertisements.Filters;

public class FiltersTest {
    private final String PRICE_FROM = "70000";
    private final String PRICE_TO = "90000";
    private String expectedTypeOfSection;
    private String expectedCountOfRooms;
    SomeScreen someScreen = new SomeScreen(InitialDriver.getDriver());
    Advert advert = new Advert(InitialDriver.getDriver());
    Filters filters = new Filters(InitialDriver.getDriver());
    Advertisements advertisements = new Advertisements(InitialDriver.getDriver());

    @BeforeTest
    public void chooseCategoriesOfAds() {
        someScreen.logIn(Credentials.EMAIL.getType(), Credentials.PASS.getType());
        filters.goToAdvertisements();
        filters.goToFiltersMenu();
        filters.chooseApartmentCategory();
        expectedTypeOfSection = filters.getTypeOfSection();

        filters.chooseRegion();
        filters.chooseAreaOfApartment();

        filters.applyFiltersForRegion();
        filters.inputPriceFromTo(PRICE_FROM, PRICE_TO);
        filters.chooseCountOfRooms();

        expectedCountOfRooms = filters.getCountOfRooms();
        filters.clickOnApply();
        filters.showAdvertsAfterFilters();
    }

    @Test
    public void enteredPriceBefore_MustBe_EqualsPriceAdsAfterSearch() {
        filters.goToAdvertisements();
        advertisements.goToFirstAdvert();

        int priceFrom = Integer.parseInt(PRICE_FROM);
        int priceTo = Integer.parseInt(PRICE_TO);
        boolean isBetweenAnd = priceFrom < advert.getPriceUSD() && advert.getPriceUSD() < priceTo;

        Assert.assertTrue(isBetweenAnd);
    }

    @Test
    public void When_ChooseCategoriesTypeOfSection_Then_EqualsAfterSearch() {
        String actualTypeOfCategory = advert.getNameOfCategoryFromAdvert();

        Assert.assertEquals(expectedTypeOfSection, actualTypeOfCategory);
    }

    @Test
    public void When_ChooseCategoriesCountOfRooms_Then_EqualsAfterSearch() {
        String actualCountOfRooms = advert.getCountOfRoomsFromAdvert();

        Assert.assertEquals(expectedCountOfRooms, actualCountOfRooms);
    }

    @AfterTest
    public void logOut() {
        filters.goToMenuProfile();
        someScreen.logOut();
    }
}
