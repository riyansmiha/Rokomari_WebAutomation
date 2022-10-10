package TestRunner;

import Base.Setup;
import Pages.Signup;
import Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;

public class SignupRunner extends Setup {
    Signup obj_signup;
    Utils utils;

    @Test(enabled = true, priority = 0)
    public void SignUp_With_Fst() throws IOException, ParseException, InterruptedException, org.json.simple.parser.ParseException {
        driver.get("https://www.rokomari.com/book");
        obj_signup = new Signup(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String user = obj_signup.SignUp_With_Fst(utils.getEmail(), utils.getPassword(), utils.getPhone(), utils.getName());
        Assert.assertEquals(user, "CREATE AN ACCOUNT");
        System.out.println(user);
    }

}
