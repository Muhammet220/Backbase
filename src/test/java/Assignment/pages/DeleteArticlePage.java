package Assignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteArticlePage extends BasePage {

    @FindBy(xpath = "(//button[contains(concat(' ',normalize-space(@class),' '),'btn-outline-danger')])[1]")
    public WebElement deleteArticleIcon;

}
