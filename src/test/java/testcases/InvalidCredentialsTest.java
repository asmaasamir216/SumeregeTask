package testcases;

import page.InvalidCredentialsPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidCredentialsTest extends BaseTest {//Verify if the given wrong credentials work

    @DataProvider(name="InvalidUserData")
    public Object[][] Data(){
        return new Object[][]{{"Invalidusername","InvalidPassword"},
                {"",""},
                {"","secret_sauce"},

                {"standard_user",""},

        };
    }
    @Test(dataProvider = "InvalidUserData")
    public void invalidLogin(String username,String password){
        InvalidCredentialsPage invalidCredentialsPage = new InvalidCredentialsPage(driver);
        invalidCredentialsPage.openurl();
        invalidCredentialsPage.invalidLogin(username,password);

        switch (username) {
            case "":  Assert.assertEquals(invalidCredentialsPage.geterrormessage(),"Epic sadface: Username is required");break;
            case "standard_user":  Assert.assertEquals(invalidCredentialsPage.geterrormessage(),"Epic sadface: Password is required"); break;
            case "Invalidusername":Assert.assertEquals(invalidCredentialsPage.geterrormessage(), "Epic sadface: Username and password do not match any user in this service"); break;

        }
    }


}
