package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckCredentialsPage extends BasePage {
    public CheckCredentialsPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "user-name")
    private WebElement UernameInput;
    @FindBy(id="password")
    private WebElement PasswordInput;
    @FindBy(id="login-button")
    private WebElement LoginButton;
    public void openurl(){
        driver.get("https://www.saucedemo.com/");
    }
    public boolean usernamefieldisDisplayed(){
        return UernameInput.isDisplayed();
    }
    public boolean passwordfieldisDisplayed(){
        return PasswordInput.isDisplayed();
    }
    public boolean loginbuttonisDisplayed(){
        return LoginButton.isDisplayed();
    }

}
