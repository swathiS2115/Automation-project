package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page.login_page;

public class Login_base {

	public static WebDriver driver;
	public login_page rent;
	@BeforeTest
	public void chrome()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indusgo.in/");
	}
	@BeforeMethod
	public void objectcreation()
	{
		rent=new login_page(driver);
	}
	//@AfterTest
//	public void teardown()
	//{
		//driver.quit();
	//}
}
