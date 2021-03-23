package tests;

import elements.Elements;
import enums.Credentials;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import pages.Profile;
import pages.SomeScreen;

import java.net.MalformedURLException;


public class ProfilePageTests {
    SomeScreen someScreen=new SomeScreen();
    Elements elements=new Elements();
    Profile profile=new Profile();



    @Before
    public void setCap() throws MalformedURLException {
      //  initialDriver.;
        someScreen.logIn(Credentials.ALEKSEI_EMAIL.getType(), Credentials.ALEKSEI_PASS.getType());
    }
    @Test
    public void isVisibleADTest() {
        Assert.assertTrue(profile.visibleElementAD());
    }

    @Test
    public void haveTextADTest(){
        Assert.assertTrue(profile.haveTextAD());
    }

    @Test
    public void isVisibleSettingsTest(){
        Assert.assertTrue(profile.visibleElementSettings());
    }
    @Test
    public void haveTextSettingTest(){
        Assert.assertTrue(profile.haveTextSettings());
    }



    @After
    public void logOut(){

        someScreen.logOut();
    }
}
