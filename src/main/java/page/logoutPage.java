package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logoutPage extends BasePage{
    public logoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "react-burger-menu-btn")
   public WebElement menu;
    @FindBy(id="logout_sidebar_link")
     WebElement logoutButton;
    public void logout(){
        menu.click();
        waitElement(logoutButton);
        logoutButton.click();
    }
}
