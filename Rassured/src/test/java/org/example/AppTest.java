package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;


import static io.restassured.RestAssured.given;

/**
 * Unit test for simple App.
 */
public class AppTest {



    /**
     * Rigourous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //https://restful-booker.herokuapp.com/ping
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        given()
                .when().get("/ping").then().statusCode(201);

    }


}
