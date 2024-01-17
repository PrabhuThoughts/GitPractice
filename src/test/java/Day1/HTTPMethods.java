package Day1;

import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.util.HashMap;
public class HTTPMethods {

	int id;
	
	@Test(priority = 1)
	void getUser()
	{
		given()
				.proxy("127.0.0.1",9000)

		.when()
			.get("https://reqres.in/api/users?page=2")
	
		.then()
		.statusCode(200) 
		
		.log().all();
			
	}
	
	//@Test(priority = 2)
	void CreateUsers()
	{
		HashMap data = new HashMap();
		data.put("name", "Prabhu");
		data.put("job", "Auto tester||");
		
		id = given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
			System.out.println("The Created User is "+id);
			
//		.then()
//			.statusCode(201)  
//			.log().all();
			
	}
	//@Test(priority = 3,dependsOnMethods = {"CreateUsers"} )
	
	void updateUser()
	{
		HashMap data = new HashMap();
		data.put("name", "Shanthana");
		data.put("job", "Senior tester||");
		

		given()
			.contentType("application/json")
		.when()
			.put( "https://reqres.in/api/users/"+id)
		.then()
			.statusCode(200)
			.log().all();
	}
	//@Test(priority = 4)
	void deleteuser()
	{
		given()
		
		.when()
			.delete("https://reqres.in/api/users/"+id)
			
		.then()
			.statusCode(204)
			.log().all();
	}
}
