package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class POSTPetStepDefinition {

    private final String BASE_URL = "https://petstore.swagger.io/v2";
    private Response response;

    @Given("user add a pet with petId {int} and category and name of the pet {string} and tags and status through POST operation")
    public void i_add_a_pet_performing_a_post_operation(Integer petId, String petName){
        response = BDDStyleMethod.getPOSTPet(petId,petName);
    }

    @Then("response of POST is status code {int}")
    public void response_of_post_is_status_code(Integer statusCode){
        Integer actualResponseCode = response.then().extract().statusCode();

        Assert.assertEquals(statusCode,actualResponseCode);
    }
}
