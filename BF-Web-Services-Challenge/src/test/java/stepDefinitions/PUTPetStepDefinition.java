package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.File;

public class PUTPetStepDefinition {

    Response response;

    @Given("user update the category and the name {string} and the tags and the status of the pet with petId {int} through PUT operation")
    public void user_update_the_name_of_the_pet_with_petId_performing_a_put_operation(String name, Integer petId){
        response = BDDStyleMethod.getPUTPet(name,petId);
    }

    @Then("response of PUT operation is status code {int}")
    public void response_of_put_operation_is_status_code(Integer statusCode){
        Integer actualResponseCode = response.then().extract().statusCode();

        Assert.assertEquals(statusCode,actualResponseCode);
    }

    @Then("validate PUT schema of response")
    public void validate_put_schema_of_response(){
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/resources/putSchema.json")));
    }
}
