package Assignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateArticlePage extends BasePage {

    @FindBy(xpath = "(//a[contains(concat(' ',normalize-space(@class),' '),'btn-outline')])[1]")
    public WebElement editArticleButton;
}
