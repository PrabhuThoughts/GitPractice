package Day1;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;


public class GetUsersThroughJson {
	@Test
	void getUser() throws IOException {
		 byte[] b = Files.readAllBytes(Paths.get("C:\\Users\\a851343\\RestAssured\\RESTAssured_Practice\\src\\test\\resources\\Payloads\\CreateUser.json"));

		    
		    String bdy = new String(b);
		    bdy.replace("$id$", "prabhu");
		    bdy.replace("$id1$", "prabhu12");
		    RestAssured.baseURI = "https://reqres.in/api/users";
		   
		    given()
			    .header("Content-type", "application/json")
			    .body(bdy)

		    
		    .when()
		    	.post("/posts")
		   
		    .then()
		    	.log().all()
		    	.assertThat().statusCode(201);
		 }
	}
	
	
   



