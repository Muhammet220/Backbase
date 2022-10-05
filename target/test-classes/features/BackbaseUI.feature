@test
Feature:CRUD Articles

  Background:
    Given the user logged in

  Scenario Outline:Create a new article
    When the user clicks New Article icon
    And the user fills the "<Article Title>" , "<What is the article about>" , "<Article>" , "<Tags>"
    And the user clicks Publish Article button
    Then the user should  be able to  create a new Article as "<Article Title>"
    Examples:
      | Article Title     | What is the article about | Article                                                    | Tags |
      | Chess GrandMaster | Anish Giri                | Anish Kumar Giri is a Russian-born Dutch chess grandmaster | None |

  Scenario:Update article
    When the user clicks created article
    And the user clicks Edit Article button
    And the user changes Article Title as "Grandmaster"
    And the user clicks Publish Article button
    Then the user should  be able to  update Article Title as "Grandmaster"

  Scenario: Post comment to article
    When the user clicks created article
    And the user fills Write a comment text box as "He is a genius"
    And the user clicks Post Comment button
    Then the user should  be able to  post comment to Article as "He is a genius"

  Scenario: Delete article
    When the user clicks created article
    And the user clicks Delete Article button
    Then the user should  be able to  delete created Article

