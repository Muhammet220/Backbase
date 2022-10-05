package Assignment.step_definitions;

import Assignment.pages.PostCommentPage;
import Assignment.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostCommentArticleStepDefs {
    PostCommentPage postCommentPage = new PostCommentPage();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    @When("the user fills Write a comment text box as {string}")
    public void theUserFillsWriteACommentTextBoxAs(String comment) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(postCommentPage.commentBox));
        postCommentPage.commentBox.sendKeys(comment);
    }

    @When("the user clicks Post Comment button")
    public void the_user_clicks_Post_Comment_button() throws InterruptedException {
        postCommentPage.postCommentButton.click();
        Thread.sleep(5);
    }

    @Then("the user should  be able to  post comment to Article as {string}")
    public void theUserShouldBeAbleToPostCommentToArticleAs(String expectedComment) {
        String actualComment = postCommentPage.postedComment.getText();
        Assert.assertEquals("Comments are not equal", actualComment, expectedComment);
    }

}
