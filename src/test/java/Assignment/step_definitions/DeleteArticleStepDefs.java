package Assignment.step_definitions;

import Assignment.pages.DeleteArticlePage;
import io.cucumber.java.en.*;

public class DeleteArticleStepDefs {
    DeleteArticlePage deleteArticlePage = new DeleteArticlePage();

    @When("the user clicks Delete Article button")
    public void the_user_clicks_Delete_Article_button() {
        deleteArticlePage.deleteArticleIcon.click();
    }

    @Then("the user should  be able to  delete created Article")
    public void the_user_should_be_able_to_delete_created_Article() {

    }
}
