package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

public static void open(String browserType) {

    switch (browserType) {
        case "chrome":
            System.setProperty("webdriver.chrome.driver","C:\\Users\\NikolayZhivkov\\IdeaProjects\\FinalExam\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            break;

        case "firefox":
            System.setProperty("webdriver.gecko.driver","C:\\Users\\NikolayZhivkov\\IdeaProjects\\FinalExam\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            break;

        default: throw new RuntimeException("The browser that is chosen" + browserType + " is not the correct driver");
    }
}

    public static void quit() {
    Browser.driver.quit();
    }
}
