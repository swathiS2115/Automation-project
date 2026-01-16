package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home_page {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id='__next']//input")
    WebElement loc;

    @FindBy(xpath = "//button[@title='Cochin']")
    WebElement loc_select;

    // We will NOT use @FindBy for Edapally (dynamic content)
    @FindBy(xpath = "//button[@class='action-btn w-full py-2 rounded-xl mt-2 flex space-x-1 justify-center items-center']")
    WebElement clicknxt;
    
    
    @FindBy(xpath = "//body[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[23]")
    WebElement strtdate;
    
    @FindBy(xpath = "//body[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/button[20]/span[1]")
    WebElement enddate;		
    
    @FindBy(xpath = "//button[normalize-space()='Done']")
    WebElement doneclick;
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/main/section/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/button")
    WebElement booknowclick;
    
    
    
    
    

    public home_page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    // Step 1: Click location input
    public void clickloc() {
        wait.until(ExpectedConditions.elementToBeClickable(loc));
        loc.click();
    }

    // Step 2: Click Cochin
    public void select_loc() {
        wait.until(ExpectedConditions.elementToBeClickable(loc_select));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loc_select);
    }

    // Step 3: Click Edapally (IMPORTANT FIX)
    public void currentloc() {

        By edapally = By.xpath("//span[normalize-space()='IndusGo, Edapally']");

        WebElement eda = wait.until(
                ExpectedConditions.visibilityOfElementLocated(edapally));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", eda);
        js.executeScript("arguments[0].click();", eda);
    }
    public void next()
    {
    	clicknxt.click();
    }
    
    public void startingdate()
    {
    	strtdate.click();
    }
    
    public void endingdate()
    {
    	enddate.click();
    }
    
    public void clickdone()
    {
    	doneclick.click();
    }
    
    public void clickbooknow()
    {
    	booknowclick.click();
    }
}
