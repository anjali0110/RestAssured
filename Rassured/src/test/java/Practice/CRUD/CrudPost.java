package Practice.CRUD;

import Practice.AuthPost;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

//public class CrudPost {
//    //NonBddStyle
//    RequestSpecification r= RestAssured.given();
//     r.baseUri("https://restful-booker.herokuapp.com");
//    //Auth to get token
//    //String
//     String payload = "{\n" +
//            "    \"username\" : \"admin\",\n" +
//            "    \"password\" : \"password123\"\n" +
//            "}";
//
//    //Hashmap
//    Map<String,String>payloadMap = new HashMap();
//    //
//
//    payloadMap.put("username","admin");
//    payloadMap.put("password","password123");
//
//    //Object POJO
//    AuthPost authPost = new AuthPost();
//    authPost.setUsername("admin");
//    authPost.setPassword("password123");
//    System.out.println(authPost);
//
//     r.basePath("/auth");
//     r.contentType(ContentType.JSON);
//     r.body(authPost);
//
//    Response response = r.when().post();
//    ValidatableResponse vr = response.then().log().all();
//    //TC#1
//     vr.statusCode(200);
//    // extract the token
//    String token = response.then().extract().path("token");
//     System.out.println(token);
//}
