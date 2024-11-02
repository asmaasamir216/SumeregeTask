package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{

    public loginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user-name")
    public WebElement userNameInput;
    @FindBy(id="password")
    public WebElement passwordInput;
    @FindBy(id="login-button")
    public WebElement loginButton;
    public void validLogin(String username, String password){
        userNameInput.sendKeys(username);

        passwordInput.sendKeys(password);
        loginButton.click();

    }
    public void invalidLogin(String username, String password){
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
         userNameInput.clear();

        passwordInput.clear();


    }

    public boolean usernamefieldisDisplayed(){
        return userNameInput.isDisplayed();
    }
    public boolean passwordfieldisDisplayed(){
        return passwordInput.isDisplayed();
    }
    public boolean loginbuttonisDisplayed(){
        return loginButton.isDisplayed();
    }
    public void clearField(){
        userNameInput.clear();
        passwordInput.clear();
    }

}
