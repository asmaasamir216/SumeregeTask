package testcases;

import page.validCredentialsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidCredentialsTest extends BaseTest {
    //Verify if the given valid credentials work
    @Test
    public void validLogin(){
        validCredentialsPage validCredentialsPage= new validCredentialsPage(driver);
        validCredentialsPage.openurl();
        validCredentialsPage.validlogin();
        Assert.assertEquals(validCredentialsPage.getLogo(),"Swag Labs");
    }
}
