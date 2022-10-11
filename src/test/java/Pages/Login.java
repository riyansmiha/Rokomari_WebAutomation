package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    @FindBy(xpath = "(//i[@class='ion-close-round'])[2]")
    WebElement popup;
    @FindBy(xpath = "//a[@href='/login']")
    WebElement clickable_signup_btn;

    @FindBy(xpath = "//input[contains(@id,'username')][@name='j_username']")
    WebElement mail;

    @FindBy(xpath = "//input[contains(@id,'password')][@name='j_password']")
    WebElement pass;

    @FindBy(xpath = "//button[contains(.,'Sign In')]")
     WebElement login_btn;

    WebElement Testassert;
    public Login (WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }
    public String Login_With_Fst (String email, String password) throws InterruptedException {

        Thread.sleep(5000);
        popup.click();
        Thread.sleep(2000);
        clickable_signup_btn.click();
        Thread.sleep(2000);
        mail.sendKeys(email);
        Thread.sleep(2000);
        pass.sendKeys(password);
        login_btn.click();

        return Testassert.getText();
    }

}
