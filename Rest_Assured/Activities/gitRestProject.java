package Git_Project;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class gitRestProject {
    // Declare request specification
    RequestSpecification requestSpec;
    // Declare response specification
    ResponseSpecification responseSpec;

    private String sshKey;
    private int id;
    final static String BaseUri="https://api.github.com";
    @BeforeClass
    public void setUp() {
        // Create request specification
       requestSpec= RestAssured.given().baseUri(BaseUri).header("Authorization","token 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");

    }
   @Test(priority=1)
    // Test case for Post request
    public void PostReq() {

       System.out.println("POST Request:");

        sshKey="ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAILaNxAfLAiDcAfUzbGa4t7gwNoMqq8mtcGbE3Jd5JFlE";
        String reqBody = "{\"title\":\"TestApiKey\",\"key\":\"" + sshKey + "\"}";
        Response response=requestSpec.body(reqBody).when().post("/user/keys");
        Assert.assertEquals(201,response.getStatusCode());
       id=response.then().extract().path("id");

        System.out.println("SSH Key ID:"+id);//103309953
       System.out.println("Response:"+response.asString());
    }
  @Test(dependsOnMethods = "PostReq")
    // Get request
    public void getinfo() {
      System.out.println("GET Request:");
        Response response =
                given().spec(requestSpec) // Set headers
                        .pathParam("keyId", id)
                        .when()
                        .get( "/user/keys/{keyId}")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response(); // Send GET request
        System.out.println(response.asString());
       Reporter.log(response.asString());

       // Assertion
      response.then().body("id", equalTo(id));
       sshKey= response.jsonPath().getString("key");
        System.out.println("Retrieved SSH Key: "+sshKey);


    }
    @Test(dependsOnMethods = "getinfo")
    // Test case for Delete
    public void deleteReq() {
        System.out.println("Delete Request:");
       Response response=given().spec(requestSpec).pathParam("keyId",id).when().delete("/user/keys/{keyId}").then().statusCode(204).extract().response();
        Reporter.log(response.asString());
      //  sshKey= response.jsonPath().getString("key");
        System.out.println("Deleted SSH key, so no Retrieved SSH Key found "+response.asString());

    }

}
