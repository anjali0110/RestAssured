package Practice.gson;

import com.google.gson.Gson;
import org.testng.annotations.Test;

public class DeSerialization {


  @Test
    public void DeSerialization(){

    String jsonString = "{\r\n" + "  \"firstName\" : \"Pramod\",\r\n" + "  \"lastName\" : \"Dutta\",\r\n"
            + "  \"gender\" : \"M\",\r\n" + "  \"age\" : 31,\r\n" + "  \"salary\" : 3422.33,\r\n"
            + "  \"married\" : false\r\n" + "}";


     Gson  gson = new Gson();
     Employee employeeObject = gson.fromJson(jsonString,Employee.class);
     //now use getter method to retrieve value
    String firstName = employeeObject.getFirstName();
    String lastName = employeeObject.getLastName();
    String gender = employeeObject.getGender();
    int age = employeeObject.getAge();
    double salary =employeeObject.getSalary();
    boolean married =employeeObject.getMarried();



    System.out.println("Details of Employee is as below:-");
    System.out.println("First Name : " + firstName);
    System.out.println("Last Name : " + lastName);
    System.out.println("Gender : " + gender);
    System.out.println("Age : " + age);
    System.out.println("Salary : " + salary);
    System.out.println("Married : " + married);




  }


}
