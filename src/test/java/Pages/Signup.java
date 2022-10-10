package Pages;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {

    WebDriver driver;


    @FindBy(xpath = "(//i[@class='ion-close-round'])[2]")
    WebElement popup;
    @FindBy(xpath = "//a[@href='/login']")
    WebElement clickable_signup_btn;

    @FindBy(xpath = "//p[contains(.,'Sign up')]")
    WebElement signup_btn;

    @FindBy(id = "nm")
    WebElement full_name;

    @FindBy(xpath = "//input[contains(@name,'email')]")
    WebElement send_email;

    @FindBy(xpath = "//input[contains(@name,'phone')]")
    WebElement send_phone;

    @FindBy(xpath = "//input[contains(@name,'pwd')]")
    WebElement send_password;

    @FindBy(id = "@FindBy(xpath = \"(//div[@role='presentation'])[1]\")")
    WebElement captcha;


    @FindBy(xpath = "//button[@data-validation-type='form-submit'][contains(.,'Create Account')]")
    WebElement create_account;

    WebElement Testassert;

    public Signup (WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

public String SignUp_With_Fst (String email, String password, String phone, String name) throws InterruptedException {

        Thread.sleep(5000);
    popup.click();
    Thread.sleep(2000);
    clickable_signup_btn.click();
    Thread.sleep(2000);
    signup_btn.click();
    Thread.sleep(2000);
    full_name.sendKeys(name);
    Thread.sleep(2000);
    send_email.sendKeys(email);
    Thread.sleep(2000);
    send_phone.sendKeys(phone);
    Thread.sleep(2000);
    send_password.sendKeys(password);
    Thread.sleep(5000);
    captcha.click();
    create_account.click();
    return Testassert.getText();
    }

}
