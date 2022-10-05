package Assignment.pages;

import Assignment.utilities.ConfigurationReader;
import Assignment.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[text()=' Sign in ']")
    public WebElement signInIcon;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()=' Sign in ']")
    public WebElement signInBtn;

    @FindBy(xpath = "(//a[@class='preview-link'])[1]/h1")
    public WebElement createdArticle;

    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    public WebElement returnToCreatedArticle;

    @FindBy(xpath = "(//a[@class='preview-link'])[1]")
    public WebElement chooseArticle;

    public void login() {
        signInIcon.click();
        email.sendKeys(ConfigurationReader.get("email"));
        password.sendKeys(ConfigurationReader.get("password"));
        signInBtn.click();
    }
}
