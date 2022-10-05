package Assignment.step_definitions;

import Assignment.pages.CreateArticlePage;
import Assignment.utilities.ConfigurationReader;
import Assignment.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class CreateArticleStepDefs {
    CreateArticlePage createArticlePage = new CreateArticlePage();

    @Given("the user logged in")
    public void the_user_logged_in() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        createArticlePage.login();
    }

    @When("the user clicks New Article icon")
    public void the_user_clicks_New_Article_icon() {
        createArticlePage.newArticleIcon.click();
    }

    @When("the user fills the {string} , {string} , {string} , {string}")
    public void theUserFillsThe(String articleTitle, String whatIsTheArticleAbout, String article, String tags) {
        Actions actions = new Actions(Driver.get());
        actions.click(createArticlePage.articleTitle)
                .sendKeys(articleTitle, Keys.TAB)
                .sendKeys(whatIsTheArticleAbout, Keys.TAB)
                .sendKeys(article, Keys.TAB)
                .sendKeys(tags)
                .sendKeys(Keys.ENTER).build().perform();
    }

    @When("the user clicks Publish Article button")
    public void the_user_clicks_Publish_Article_button() {
        createArticlePage.publishArticle.click();
    }

    @Then("the user should  be able to  create a new Article as {string}")
    public void theUserShouldBeAbleToCreateANewArticleAs(String expectedArticleTitle) {
        createArticlePage.returnToCreatedArticle.click();
        String actualArticleTitle = createArticlePage.createdArticle.getText();
        Assert.assertEquals("Article is not created", actualArticleTitle, expectedArticleTitle);
    }


}
