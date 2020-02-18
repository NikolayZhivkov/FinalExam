package Pages;

import Utils.Browser;
import org.openqa.selenium.By;

public class SecPositiveReg {
    private static final By LOC_MY_ACCOUNT= By.xpath("//i[@class=\"fa fa-user\"]//..//span[@class=\"hidden-xs hidden-sm hidden-md\"]");
    private static final By LOC_LOGIN =By.xpath("//ul[@class=\"dropdown-menu dropdown-menu-right\"]//..//li[2]");
    private static final By LOC_EMAIL_ADRESS = By.id("input-email");
    private static final By LOC_PASSWORD  = By.id("input-password");
    private static final By LOC_LOGIN_BUTTON =By.xpath("//input[@class=\"btn btn-primary\"]");
    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/");
    }

    public static void myAcount() throws InterruptedException {
        Browser.driver.findElement(LOC_MY_ACCOUNT).click();
        Thread.sleep(10);
        Browser.driver.findElement(LOC_LOGIN).click();
    }

    public static void login(String emailAdress, String password) {
        Browser.driver.findElement(LOC_EMAIL_ADRESS).sendKeys(emailAdress);
        Browser.driver.findElement(LOC_PASSWORD).sendKeys(password);
        Browser.driver.findElement(LOC_LOGIN_BUTTON).click();
    }
}
