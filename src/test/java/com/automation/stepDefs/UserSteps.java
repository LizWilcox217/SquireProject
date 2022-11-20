package com.automation.stepDefs;

import com.automation.endpoints.UserEndpoint;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UserSteps {
    UserEndpoint userEndpoint = new UserEndpoint();
    @When("A user is created")
    public void a_user_is_created() {
        userEndpoint.createUser();
    }

    @And("User is sent to server")
    public void userIsSentToServer() {
        userEndpoint.postUser();
    }

    @Then("Verify user has been created")
    public void verify_user_has_been_created() {
        userEndpoint.verifyUserExists();
    }

    @When("User information is updated")
    public void user_information_is_updated() {
        userEndpoint.updateUserInfo();
    }
    @Then("Verify user has been updated")
    public void verify_user_has_been_updated() {
        userEndpoint.verifyUserUpdated();
    }
    @When("User is deleted")
    public void user_is_deleted() {
        userEndpoint.deleteUser();
    }
    @Then("Verify user has been deleted")
    public void verify_user_has_been_deleted() {
        userEndpoint.verifyUserDeleted();
    }

    @Then("User can add modify favorite city and country")
    public void user_can_add_modify_favorite_city_and_country()
    {userEndpoint.addCityAndCountry();

    }

}
