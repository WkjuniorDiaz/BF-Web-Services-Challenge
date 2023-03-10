package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;

import static io.restassured.RestAssured.given;

public class GETPetStepDefinition {

    private Response response;

    @Given("I perform GET for the petID {string}")
    public void i_perform_get_for_the_petID(String petID){
        response = BDDStyleMethod.getGETPet(petID);
    }

    @Then("response is status code {int}")
    public void response_is_status_code(Integer statusCode){
         Integer actualResponseCode = response.then().extract().statusCode();

        Assert.assertEquals(statusCode,actualResponseCode);
    }

    @Then("validate get schema of response")
    public void validate_schema_of_response(){
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/resources/getSchema.json")));
    }


}
