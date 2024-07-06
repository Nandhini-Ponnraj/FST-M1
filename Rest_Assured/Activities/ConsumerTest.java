package liveproject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import java.util.HashMap;
import java.util.Map;

import static arrow.core.PartialFunctionKt.then;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
    Map<String,String> headers=new HashMap<>();
    @Pact(consumer = "UserConsumer",provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder){
        headers.put("Content-Type","application/json");
        DslPart reqAndResBody=new PactDslJsonBody()
                .numberType("id","2727")
                .stringType("firstName","Nandhini")
                .stringType("lastName","Ponnraj")
                .stringType("email","nandhiniponnraj@gg.com");
        return builder.given("POST request")
                .uponReceiving("a request to create a user")
                .method("POST")
                .path("api/users")
                .headers(headers)
                .body(reqAndResBody)
                .willRespondWith()
                .status(201)
                .body(reqAndResBody)
                .toPact();
    }
    @Test
    @PactTestFor(providerName = "UserProvider",port="8282")
    public void postRequestTest(){
        Map<String,String> reqBody=new HashMap<>();
        reqBody.put("id","2727");
        reqBody.put("firstName","Nandhini");
        reqBody.put("lastName","Ponnraj");
        reqBody.put("email","nandhiniponnraj@gg.com");
        given().baseUri("http://localhost:8282").headers(headers).body(reqBody).log().all();
        when().post("api/users").then().statusCode(201).body("email",equalTo("nandhiniponnraj@gg.com")).log().all();

                //body("email",equalTo("nandhini.ponnraj@gg.com")).log().all();
    }

}

