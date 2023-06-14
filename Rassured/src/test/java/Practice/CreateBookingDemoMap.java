package Practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateBookingDemoMap {
 public static void main(String[] args) {
     RequestSpecification r= RestAssured.given();
     r.baseUri("https://restful-booker.herokuapp.com");
//    Map <String,Object> map = new HashMap();
//    map.put("name","Anjali");
//    map.put("age",31);
//     map.put("id",321);
//     System.out.println(map);
//       String payloadPutRequest = "{\n" +
//                "    \"firstname\" : \"Jim\",\n" +
//                "    \"lastname\" : \"Brown\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";
//     {
//         "firstname" : "Anjali",
//             "lastname" : "Pahariya",
//             "totalprice" : 111,
//             "depositpaid" : true,
//             "bookingdates" : {
//         "checkin" : "2018-01-01",
//                 "checkout" : "2019-01-01"
//     },
//         "additionalneeds" : "Breakfast"
//     }

       //json-->map
     //1st map
     Map<String,Object>parent = new HashMap();
     parent.put("firstname","jim");
     parent.put("lastname","Brown");
     parent.put("totalprice",111);
     parent.put("depositpaid",true);
     parent.put("additionalneeds","Breakfast");
     Map<String,String> bookingdatesMap = new HashMap();
     bookingdatesMap.put("checkin","2018-01-01");
     bookingdatesMap.put("checkout","2019-01-01");
     parent.put("bookingdates",bookingdatesMap);


     System.out.println(parent);

     //2nd map
     Map<String,Object>parent2 = new HashMap();
     parent2.put("firstname","anjali");
     parent2.put("lastname","pahariya");
     parent2.put("totalprice",111);
     parent2.put("depositpaid",true);
     parent2.put("additionalneeds","Breakfast");
     Map<String,String> bookingdatesMap2 = new HashMap();
     bookingdatesMap2.put("checkin","2018-01-01");
     bookingdatesMap2.put("checkout","2019-01-01");
     parent.put("bookingdates",bookingdatesMap2);


     System.out.println(parent2);

     List<Map<String,Object>> mylist =new ArrayList();
     mylist.add(parent);
     mylist.add(parent2);
     System.out.println(mylist);


     r.basePath("/booking");
     r.contentType(ContentType.JSON);
     r.body(parent);

     Response response = r.when().post();
     ValidatableResponse vr = response.then().log().all();
     //TC#1
     vr.statusCode(200);
     // extract the token
     Integer bookingid = response.then().extract().path("bookingid");
     System.out.println(bookingid);

     //JSON object-/map
     //JSON array ->array list

     //{firstname=jim, additionalneeds=Breakfast, bookingdates={checkin=2018-01-01, checkout=2019-01-01}, totalprice=111, depositpaid=true, lastname=Brown}
    }
}