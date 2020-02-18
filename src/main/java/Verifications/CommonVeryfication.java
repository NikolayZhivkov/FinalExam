package Verifications;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonVeryfication {
//    private static final By LOC_ERROR_FISRT_NAME = By.xpath("//input[@id=\"input-firstname\"]//..//div[@class=\"text-danger\"]");
//    private static final By LOC_ERROR_LAST_NAME = By.xpath("//input[@id=\"input-lastname\"]//..//div[@class=\"text-danger\"]");
//    private static final By LOC_ERROR_EMAIL = By.xpath("//input[@id=\"input-email\"]//..//div[@class=\"text-danger\"]");
//    private static final By LOC_ERROR_TELEPHONE = By.xpath("//input[@id=\"input-telephone\"]//..//div[@class=\"text-danger\"]");
//    private static final By LOC_ERROR_PASSWORD = By.xpath("//input[@id=\"input-password\"]//..//div[@class=\"text-danger\"]");

    public static void verifyTitle(String expectedTitle, String errorMessage) throws InterruptedException {

        Thread.sleep(10);

        String actualTitle = Browser.driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, errorMessage);
    }

    public static void errorMessages() {

//        WebElement firstNameError = Browser.driver.findElement(LOC_ERROR_FISRT_NAME);
//        firstNameError.getText();
//        Assert.assertEquals(firstNameError,"First Name must be between 1 and 32 characters!","The error message is incorrect!");
//
//        WebElement lastNameError = Browser.driver.findElement(LOC_ERROR_LAST_NAME);
//        lastNameError.getText();
//        Assert.assertEquals(lastNameError,"Last Name must be between 1 and 32 characters!","The error message is incorrect!");
//
//        WebElement emailError = Browser.driver.findElement(LOC_ERROR_EMAIL);
//        emailError.getText();
//        Assert.assertEquals(emailError,"E-Mail Address does not appear to be valid!","The error message is incorrect!");
//
//        WebElement telephoneError = Browser.driver.findElement(LOC_ERROR_TELEPHONE);
//        telephoneError.getText();
//        Assert.assertEquals(telephoneError,"Telephone must be between 3 and 32 characters!","The error message is incorrect!");
//
//        WebElement passwordError = Browser.driver.findElement(LOC_ERROR_PASSWORD);
//        passwordError.getText();
//        Assert.assertEquals(passwordError,"Password must be between 4 and 20 characters!","The error message is incorrect!");
        WebElement errorMessages = Browser.driver.findElement(By.cssSelector("div.text-danger"));

        List<String> exp_errors = Arrays.asList(
                "First Name must be between 1 and 32 characters!",
                "Last Name must be between 1 and 32 characters!",
                "E-Mail Address does not appear to be valid!",
                "Telephone must be between 3 and 32 characters!",
                "Password must be between 4 and 20 characters!");


        List<WebElement> errorElements = Browser.driver.findElements(By.cssSelector("div.text-danger"));

        for (WebElement currErrElement : errorElements) {
            if(!exp_errors.contains(currErrElement.getText())){
                Assert.fail("The error messages are not completely correct!");
            }
        }




//        List<String> act_errors = new ArrayList<>();
//
//        List<String> all_errors = Collections.singletonList(errorMessages.getText());




//        for (String errors : all_errors) {
//            act_errors.add(errors);
//
//            Assert.assertEquals(act_errors.toArray(), exp_errors.toArray());
//
//        }


    }
}
