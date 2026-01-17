package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page.home_page;

public class home_base {

    public static WebDriver driver;
    public home_page rnt;

    @BeforeTest
    public void chrome() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.indusgo.in/");
    }

    @BeforeMethod
    public void objectcreation() {
        rnt = new home_page(driver);
    }
}
