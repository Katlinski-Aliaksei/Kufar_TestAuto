package tests.advertisements;

import core.InitialDriver;
import io.qameta.allure.Description;
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
    @Description("Check on conformity prices before and after filters")
    public void pricesIsEquals() {
        int priceFrom = Integer.parseInt(PRICE_FROM);
        int priceTo = Integer.parseInt(PRICE_TO);
        boolean isBetweenAnd = priceFrom <= advert.getPriceUSD() && advert.getPriceUSD() <= priceTo;
        Assert.assertTrue(isBetweenAnd);
    }

    @Test(priority = 1)
    @Description("Check on conformity types of sections before and after filters")
    public void typeOfSectionsIsEquals() {
        String actualTypeOfCategory = advert.getNameOfCategoryFromAdvert();

        Assert.assertEquals(expectedTypeOfSection, actualTypeOfCategory);
    }

    @Test(priority = 1)
    @Description("Check on conformity count of rooms before and after filters")
    public void countOfRoomsIsEquals() {
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
        filters.chooseImmovabilityCategory();
        expectedTypeOfSection = filters.getTypeOfSection();
        filters.chooseApartmentSection();
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
