package Assignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateArticlePage extends BasePage{

    @FindBy(xpath = "//i[@class='ion-compose']")
    public WebElement newArticleIcon;

    @FindBy(xpath = "//input[@formcontrolname='title']")
    public WebElement articleTitle;

    @FindBy(xpath = "//button[text()=' Publish Article ']")
    public WebElement publishArticle;
}
