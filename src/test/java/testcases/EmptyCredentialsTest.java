package testcases;

import page.EmptyCredentialsPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmptyCredentialsTest extends BaseTest {
    //Check for empty credentials
    @DataProvider(name="InvalidUserData")
    public Object[][] Data(){
        return new Object[][]{{"",""}};}

    @Test
    public void emptycredentialsLogin(){
        EmptyCredentialsPage emptyCredentialsPage = new EmptyCredentialsPage(driver);
        emptyCredentialsPage.openurl();
        emptyCredentialsPage.emptyCredentialsLogin();
        Assert.assertEquals(emptyCredentialsPage.getErroemessage(),"Epic sadface: Username is required");
        emptyCredentialsPage.emptyPasswordlogin();
        Assert.assertEquals(emptyCredentialsPage.getErroemessage(),"Epic sadface: Password is required");

    }

}
