package Assignment.step_definitions;

import Assignment.pages.BasePage;
import Assignment.pages.CreateArticlePage;
import Assignment.pages.UpdateArticlePage;
import Assignment.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateArticleStepDefs {
    BasePage basePage = new BasePage();
    UpdateArticlePage updateArticlePage = new UpdateArticlePage();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
    CreateArticlePage createArticlePage = new CreateArticlePage();

    @When("the user clicks created article")
    public void the_user_clicks_created_article() {
        basePage.returnToCreatedArticle.click();
        wait.until(ExpectedConditions.elementToBeClickable(basePage.chooseArticle));
        basePage.chooseArticle.click();
    }

    @When("the user clicks Edit Article button")
    public void the_user_clicks_Edit_Article_button() {
        wait.until(ExpectedConditions.elementToBeClickable(updateArticlePage.editArticleButton)).click();
    }

    @When("the user changes Article Title as {string}")
    public void theUserChangesArticleTitleAs(String title) {
        createArticlePage.articleTitle.clear();
        createArticlePage.articleTitle.sendKeys(title, Keys.ENTER);
    }

    @Then("the user should  be able to  update Article Title as {string}")
    public void theUserShouldBeAbleToUpdateArticleTitleAs(String expectedArticleTitle) {
        createArticlePage.returnToCreatedArticle.click();
        String actualArticleTitle = createArticlePage.createdArticle.getText();
        Assert.assertEquals("Article title is not updated", actualArticleTitle, expectedArticleTitle);
    }
}
