package Practice.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Serialization {




    @Test
    public void Serialization()throws IOException{
        // create a employee java object
        Employee employeeObject = new Employee();
        employeeObject.setFirstName("Anjali");
        employeeObject.setLastName("Pahariya");
        employeeObject.setAge(33);
        employeeObject.setSalary(500.00);
        employeeObject.setMarried(false);
        employeeObject.setGender("M");

        //Create  aGson Object
        Gson gson =new Gson ();
        String employeeJsonString = gson.toJson(employeeObject);
        //printing json string it will be pretty print
        System.out.println("Non-pretty JSON String :- ");
        System.out.println(employeeJsonString);

        // we can create a configurable Gson instance  using GsonBuilder class
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String employeeJsonStringJsonBuilder = gsonBuilder.toJson(employeeObject);
        System.out.println("pretty JSON String :- ");
        System.out.println(employeeJsonStringJsonBuilder);

        // To
        //Appendable interface
//        String userDir = System.getProperty("user.dir");
//        File outputJsonFile = new File(userDir+ "/src/test/java/resource/GSONpayload.json");
//        FileWriter fileWriter = new FileWriter(outputJsonFile);
//        gsonBuilder.toJson(employeeObject,fileWriter);
//        fileWriter.flush();












    }
}
