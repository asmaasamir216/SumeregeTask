package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvalidCredentialsPage extends BasePage {
    public InvalidCredentialsPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "user-name")
    private WebElement UernameInput;
    @FindBy(id="password")
    private WebElement PasswordInput;
    @FindBy(id="login-button")
    private WebElement LoginButton;
    @FindBy(className = "error-message-container")
    private WebElement ErrorMessage;
    public void openurl(){
        driver.get("https://www.saucedemo.com/");
    }
    public void invalidLogin(String username, String password){
        UernameInput.sendKeys(username);
        PasswordInput.sendKeys(password);
        LoginButton.click();
    }
    public String geterrormessage(){
        return  ErrorMessage.getText();
    }
    public void emptyCredentialsLogin(){
        LoginButton.click();
    }
    public void emptyPasswordlogin(){
        UernameInput.sendKeys("invalidUsername");
        LoginButton.click();
    }

}
