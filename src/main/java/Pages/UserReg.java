package Pages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserReg {

private static final By LOC_MY_ACCOUNT= By.xpath("//i[@class=\"fa fa-user\"]//..//span[@class=\"hidden-xs hidden-sm hidden-md\"]");
private static final By LOC_REGISTER =By.xpath("//ul[@class=\"dropdown-menu dropdown-menu-right\"]//..//li[1]");
private static final By LOC_FIRST_NAME = By.id("input-firstname");
private static final By LOC_LAST_NAME = By.id("input-lastname");
private static final By LOC_EMAIL = By.id("input-email");
private static final By LOC_PHONE_NUMBER = By.id("input-telephone");
private static final By LOC_PASSWORD = By.id("input-password");
private static final By LOC_CONFIRM_PASS =By.id("input-confirm");
private static final By LOC_CONTINUE_BUTT = By.xpath("//input[@class=\"btn btn-primary\"] ");


    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/");
    }

    public static void myAcount() throws InterruptedException {

        Browser.driver.findElement(LOC_MY_ACCOUNT).click();
        Thread.sleep(10);
        Browser.driver.findElement(LOC_REGISTER).click();




    }


    public static void registerPersonalDetails(String firstName, String lastName, String email, String telephone) {

        Browser.driver.findElement(LOC_FIRST_NAME).sendKeys(firstName);
        Browser.driver.findElement(LOC_LAST_NAME).sendKeys(lastName);
        Browser.driver.findElement(LOC_EMAIL).sendKeys(email);
        Browser.driver.findElement(LOC_PHONE_NUMBER).sendKeys(telephone);
    }

    public static void yourPassword(String pass, String passConfirm) {
        Browser.driver.findElement(LOC_PASSWORD).sendKeys(pass);
        Browser.driver.findElement(LOC_CONFIRM_PASS).sendKeys(passConfirm);

    }

    public static void newsletter() {
        WebElement radioButtonYes = Browser.driver.findElement(By.xpath("//label[@class=\"radio-inline\"]//input[@value=\"1\"]"));
        radioButtonYes.click();
        if(!radioButtonYes.isSelected()){
            radioButtonYes.click();
        }
        
    }

    public static void privacyPolicy() {
        WebElement checkBox = Browser.driver.findElement(By.xpath("//a[@class=\"agree\"]//..//input[@value=\"1\"]"));
        checkBox.click();
        if(!checkBox.isSelected()){
            checkBox.click();
        }
    }

    public static void registerButton() {
        Browser.driver.findElement(LOC_CONTINUE_BUTT).click();

    }

    public static void negativeRegistration() {
        WebElement radioButtonYes = Browser.driver.findElement(By.xpath("//label[@class=\"radio-inline\"]//input[@value=\"1\"]"));
        radioButtonYes.click();
        if(!radioButtonYes.isSelected()){
            radioButtonYes.click();
        }
        WebElement checkBox = Browser.driver.findElement(By.xpath("//a[@class=\"agree\"]//..//input[@value=\"1\"]"));
        checkBox.click();
        if(!checkBox.isSelected()){
            checkBox.click();
        }
        Browser.driver.findElement(LOC_CONTINUE_BUTT).click();
        Assert.assertEquals(Browser.driver.getTitle(),"Register Account");
    }
}
