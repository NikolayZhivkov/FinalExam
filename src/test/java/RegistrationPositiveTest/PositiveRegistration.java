package RegistrationPositiveTest;

import Pages.UserReg;
import Utils.Browser;
import Verifications.CommonVeryfication;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.jws.soap.SOAPBinding;
import java.util.concurrent.BrokenBarrierException;

public class PositiveRegistration {

    @BeforeMethod
    public void setUp(){
        Browser.open("chrome");

    }
    @AfterMethod
    public void tearDown(){
        Browser.quit();
    }

    @Test
    public void positiveRegistration() throws InterruptedException {

        UserReg.goTo();

        UserReg.myAcount();
        CommonVeryfication.verifyTitle("Register Account","Opps something is wrong!!!");
        UserReg.registerPersonalDetails("mariqa","mariqqqqqa","naknaaa@abv.bg","08545658");

        UserReg.yourPassword("12a3456","12a3456");
        UserReg.newsletter();
        UserReg.privacyPolicy();
        UserReg.registerButton();
        CommonVeryfication.verifyTitle("Your Account Has Been Created!","Sorry for this problem!!!");

    }

}
