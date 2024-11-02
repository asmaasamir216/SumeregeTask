package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class validCredentialsPage extends BasePage {
    public validCredentialsPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "user-name")
    private WebElement UernameInput;
   @FindBy(id="password")
    private WebElement PasswordInput;
    @FindBy(id="login-button")
    private WebElement LoginButton;
    @FindBy(className = "app_logo")
    private WebElement AppLogo;
    public void openurl(){
        driver.get("https://www.saucedemo.com/");
    }
    public void validlogin(){
        UernameInput.sendKeys("standard_user");
        PasswordInput.sendKeys("secret_sauce");
        LoginButton.click();
    }
    public String getLogo(){
        return AppLogo.getText();
    }

}
