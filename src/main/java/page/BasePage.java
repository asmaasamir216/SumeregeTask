package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
   public void waitElement(WebElement element){
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
       wait.until(ExpectedConditions.visibilityOf(element));
   }

}
