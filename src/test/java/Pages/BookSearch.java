package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

import java.beans.PropertyChangeListener;

public class BookSearch {

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

    @FindBy(xpath = "//input[contains(@name,'term')]")
    WebElement search;

    @FindBy(xpath = "//i[@class='ion-ios-search-strong']")
    WebElement search_bar;

    @FindBy(xpath = "(//a[@href='/book/158055/master-of-tense'])[2]")
    WebElement product_hover;

    @FindBy(xpath = "(//a[contains(.,'View Details')])[2]")
    WebElement view_details;

    @FindBy(id = "js--add-to-cart-button")
    WebElement addtoCart;

    @FindBy(xpath = "//a[@href='/cart'][contains(.,'Go to Cart')]")
     WebElement gotoCart ;

    @FindBy(xpath = "//i[@class='ion-ios-plus-empty']")
    WebElement iconPlus_btn1;

    @FindBy(xpath = "//button[contains(@id,'btn-plus')]")
    WebElement iconPlus_btn2;

    @FindBy(xpath = "//button[@id='btn-minus']")
    WebElement iconMinus_btn;

    @FindBy(xpath = "//span[contains(.,'Place Order')]")
    WebElement place_order;

    WebElement Testassert;

    public BookSearch (WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String Search (String email, String password) throws InterruptedException {

        Thread.sleep(5000);
        popup.click();
        Thread.sleep(2000);
        clickable_signup_btn.click();
        Thread.sleep(2000);
        mail.sendKeys(email);
        Thread.sleep(2000);
        pass.sendKeys(password);
        login_btn.click();

        Thread.sleep(5000);
        search.sendKeys("Master of Tense");

        Thread.sleep(2000);
        search_bar.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(product_hover).build();
        Thread.sleep(3000);
        view_details.click();

        Thread.sleep(2000);
        addtoCart.click();
        Thread.sleep(5000);
        gotoCart.click();
        Thread.sleep(2000);
        iconPlus_btn1.click();
        Thread.sleep(1000);
        iconPlus_btn2.click();
        iconMinus_btn.click();
        Thread.sleep(3000);
        place_order.click();


        return Testassert.getText();
    }

}
