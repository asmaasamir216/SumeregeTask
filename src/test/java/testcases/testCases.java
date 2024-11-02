package testcases;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.CheckCredentialsPage;
import page.loginPage;
import page.logoutPage;

import java.io.IOException;


public class testCases extends BaseTest {
    loginPage loginObj;
    logoutPage logoutObj;

    excelFiles excelData = new excelFiles();

    @DataProvider(name = "validCredentials")
    public Object[][] getData() throws IOException {
        return excelData.getExcelData("validLogin.xlsx/");
        // Adjust filename as necessary
    }
    @DataProvider(name = "invalidCredentials")
    public Object[][] getinvalidData() throws IOException {
        return excelData.getExcelData("invalidLogin.xlsx/");
        // Adjust filename as necessary
    }
    @Test
    public void checkCredentials(){
        loginObj=new loginPage(driver);
        Assert.assertTrue(loginObj.usernamefieldisDisplayed());
        Assert.assertTrue(loginObj.passwordfieldisDisplayed());
        Assert.assertTrue(loginObj.loginbuttonisDisplayed());
    }
    @Test(dataProvider = "validCredentials", dependsOnMethods = {"checkCredentials"})
    public void validlogin(String username,String password){
        loginObj=new loginPage(driver);
        logoutObj=new logoutPage(driver);
      loginObj.validLogin(username,password);
    }
    @Test(dataProvider = "invalidCredentials", dependsOnMethods = {"checkCredentials"})
    public void invalidlogin(String username,String password){
        loginObj=new loginPage(driver);
        logoutObj=new logoutPage(driver);
        loginObj.invalidLogin(username,password);
    }





}
    //src/test/java/testcases/loginData.xlsx

