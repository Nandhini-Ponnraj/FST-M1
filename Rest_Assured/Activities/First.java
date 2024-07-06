package examples;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class First {

    //https://petstore.swagger.io/v2/pet/findByStatus?status=alive
    @Test
    public void getRequestByQueryParam(){

        Response response=
                given().
                        baseUri("https://petstore.swagger.io/v2/pet").
                        header("Content-Type","application/json").
                        queryParam("status","alive").
                        log().all().
                when().
                        get("/findByStatus");

                        System.out.println("Header is: "+response.getHeaders());
        System.out.println("Body as String: "+response.getBody().asString());
        System.out.println("Body as pretty string:"+response.getBody().asPrettyString());
        String petStatus=response.then().extract().path("[0]['status']");
        System.out.println("Pet status: "+petStatus);
        Assert.assertEquals(petStatus,"alive");

    }
@Test
    public void getRequestByPathParam(){
        //https://petstore.swagger.io/v2/pet/{petId}


   // Response response=
            given().
                    baseUri("https://petstore.swagger.io/v2/pet").
                    header("Content-Type","application/json").
                    pathParam("petId",772321).
                    log().all().
                    when().
                    get("/{petId}").
                    then().
                    statusCode(200).
                    body("name",equalTo("Riley")).
                    body("status",equalTo("alive")).
                    log().all();


}
}
