package TestRunner;

import Base.Setup;
import Pages.BookSearch;
import Pages.Signup;
import Utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;

public class BookSearchRunner extends Setup {
    BookSearch obj_booksearch;
    Utils utils;

    @Test(enabled = true, priority = 0)
    public void Search() throws IOException, ParseException, InterruptedException, org.json.simple.parser.ParseException {
        driver.get("https://www.rokomari.com/book");
        obj_booksearch = new BookSearch(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String user = obj_booksearch.Search(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(user, "Search Succesfully");
        System.out.println(user);
    }
}
