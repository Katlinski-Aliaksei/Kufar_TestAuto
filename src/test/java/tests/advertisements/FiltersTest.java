package tests.advertisements;

import core.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.advertisements.Advert;
import pages.advertisements.Advertisements;
import pages.advertisements.Filters;

public class FiltersTest {
    private final String PRICE_FROM = "70000";
    private final String PRICE_TO = "90000";
    private String expectedTypeOfSection;
    private String expectedCountOfRooms;
    Advert advert = new Advert(InitialDriver.getDriver());
    Filters filters = new Filters(InitialDriver.getDriver());
    Advertisements advertisements = new Advertisements(InitialDriver.getDriver());

    @BeforeTest
    public void chooseCategoriesOfAds() {
        chooseTypesOfCategory();
        filters.inputPriceFromTo(PRICE_FROM, PRICE_TO);
        chooseCountOfRooms();
        filters.showAdvertsAfterFilters();
        getFirstAdvert();
    }

    @Test
    public void enteredPriceBefore_MustBe_EqualsPriceAdsAfterSearch() {
        int priceFrom = Integer.parseInt(PRICE_FROM);
        int priceTo = Integer.parseInt(PRICE_TO);
        boolean isBetweenAnd = priceFrom <= advert.getPriceUSD() && advert.getPriceUSD() <= priceTo;
        Assert.assertTrue(isBetweenAnd);
    }

    @Test(priority = 1)
    public void When_ChooseCategoriesTypeOfSection_Then_EqualsAfterSearch() {
        String actualTypeOfCategory = advert.getNameOfCategoryFromAdvert();

        Assert.assertEquals(expectedTypeOfSection, actualTypeOfCategory);
    }

    @Test(priority = 1)
    public void When_ChooseCategoriesCountOfRooms_Then_EqualsAfterSearch() {
        String actualCountOfRooms = advert.getCountOfRoomsFromAdvert();

        Assert.assertEquals(expectedCountOfRooms, actualCountOfRooms);
    }

    @AfterTest
    public void goToMainPage() {
        advert.goBack();
    }

    private void chooseTypesOfCategory() {
        filters.goToAdvertisements();
        filters.goToFiltersMenu();
        filters.chooseApartmentCategory();
        expectedTypeOfSection = filters.getTypeOfSection();
    }

    private void chooseCountOfRooms() {
        filters.chooseCountOfRooms();
        expectedCountOfRooms = filters.getCountOfRooms();
        filters.clickOnApply();
    }

    private void getFirstAdvert() {
        filters.goToListingViewResults();
        filters.goToAdvertisements();
        advertisements.goToFirstAdvert();
    }
}
