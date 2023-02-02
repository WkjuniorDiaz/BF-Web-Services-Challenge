package stepDefinitions;

import io.restassured.response.Response;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BDDStyleMethod {

    public static Response getGETPet(String petId){
        Response response =
        given()
                .header("accept","application/json")
        .with().
                pathParams("petId",petId)
        .when()
                .get("https://petstore.swagger.io/v2/pet/{petId}");

        return  response;
    }

    public static Response getPOSTPet(Integer petId, String petName){

        Response response;

        Map<String,Object> categoryObject = new HashMap<String,Object>();
        categoryObject.put("id",2);
        categoryObject.put("name","cats");

        Map<String,Object> mainObject = new HashMap<String,Object>();
        mainObject.put("id",petId);
        mainObject.put("category",categoryObject);
        mainObject.put("name",petName);
        mainObject.put("tags", Arrays.asList(new LinkedHashMap<String,Object>() {
            {
                put("id",2);
            }
            {
                put("name","tag1");
            }
        }));
        mainObject.put("status","available");

        response =
                given()
                        .header("accept","application/json")
                        .header("Content-Type","application/json")
                        .body(mainObject)
                .when()
                        .post("https://petstore.swagger.io/v2/pet");

        return response;
    }

    public static Response getPUTPet(String name, Integer petId){

        Response response;

        Map<String,Object> mainObject = new HashMap<String,Object>();
        mainObject.put("id",petId);
        mainObject.put("name",name);


        response =
        given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body(mainObject)
        .when()
                .put("https://petstore.swagger.io/v2/pet");

        return  response;

    }
}
