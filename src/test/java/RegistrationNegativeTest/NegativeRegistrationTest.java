package RegistrationNegativeTest;

import Pages.UserReg;
import Utils.Browser;
import Verifications.CommonVeryfication;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeRegistrationTest {

    @BeforeMethod
    public void setUp(){
        Browser.open("firefox");
    }
    @AfterMethod
    public void tearDiwn(){
        Browser.quit();
    }

    @Test
    public void negativeRegistrationTest() throws InterruptedException {
        UserReg.goTo();
        UserReg.myAcount();
        CommonVeryfication.verifyTitle("Register Account","Opps something is wrong!!!");
        UserReg.negativeRegistration();
        CommonVeryfication.errorMessages();


    }
}
