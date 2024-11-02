package testcases;

import page.CheckCredentialsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCredentialsTest extends BaseTest {
    //Verify if the username and password fields are on the main screen
    @Test
    public void checkCredentials(){
        CheckCredentialsPage checkCredentialsPage=new CheckCredentialsPage(driver);
        checkCredentialsPage.openurl();
        Assert.assertTrue(checkCredentialsPage.usernamefieldisDisplayed());
        Assert.assertTrue(checkCredentialsPage.passwordfieldisDisplayed());
        Assert.assertTrue(checkCredentialsPage.loginbuttonisDisplayed());
    }
}
