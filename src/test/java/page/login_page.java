package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	WebDriver driver;
	 @FindBy(xpath = "//*[@id=\"login-or-signup\"]") //login click
	WebElement profile;
	  @FindBy(xpath = "//input[@placeholder='Enter Your Phone Number']") //enter phone num
	  WebElement phonnenum;
	  @FindBy(xpath = "//span[normalize-space()='Send verification code']") //click verification
	  WebElement verifycode;

	 
	 
	 
	 
	 public login_page(WebDriver driver) {
		 this.driver=driver;
			PageFactory.initElements( driver,this);
		
	}
	 
	 
	 
	 public void clickprofile()
	 {
		 profile.click();
	 }
	 public void enterphonenumber(String phn)
	 {
		 phonnenum.sendKeys(phn);
	 }
	 public void clickverify()
	 {
		 verifycode.click();
	 }
	 
}
