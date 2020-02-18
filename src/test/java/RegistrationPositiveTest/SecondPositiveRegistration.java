package RegistrationPositiveTest;

import Pages.SecPositiveReg;
import Utils.Browser;
import Verifications.CommonVeryfication;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondPositiveRegistration {
    @BeforeMethod
    public void setUp(){
        Browser.open("chrome");
    }
    @AfterMethod
    public void tearDown(){
        Browser.quit();
    }
    @Test
    public void secondPositiveRegistration() throws InterruptedException {
        SecPositiveReg.goTo();
        SecPositiveReg.myAcount();
        CommonVeryfication.verifyTitle("Account Login","Opps wrong page");
        SecPositiveReg.login("naknaaa@abv.bg","12a3456");
        CommonVeryfication.verifyTitle("My Account","You are on the wrong page!!");

    }
}
