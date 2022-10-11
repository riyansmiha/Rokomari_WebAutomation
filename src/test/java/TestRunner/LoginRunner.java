package TestRunner;

import Base.Setup;
import Pages.Login;
import Utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;

public class LoginRunner extends Setup {
    Login obj_login;
    Utils utils;

    @Test(enabled = true, priority = 0)
    public void Login_With_Fst() throws IOException, ParseException, InterruptedException, org.json.simple.parser.ParseException {
        driver.get("https://www.rokomari.com/book");
        obj_login = new Login (driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String nn=obj_login.Login_With_Fst(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn, "Login");
        System.out.println(nn);

    }
}
