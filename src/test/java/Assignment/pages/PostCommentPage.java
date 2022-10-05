package Assignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostCommentPage extends BasePage {

    @FindBy(xpath = "//textarea")
    public WebElement commentBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement postCommentButton;

    @FindBy(xpath = "(//div[@class='card-block'])[2]")
    public WebElement postedComment;

}
