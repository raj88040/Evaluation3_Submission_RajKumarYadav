package restAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Beeceptorposthook {
	String url = "https://posthook-api.mock.beeceptor.com";
	
	@Test(enabled = false)
	public void ScheduleaHook() {
		
	
		RestAssured.baseURI = url;
		given().when().post("/v1/hooks").then().statusCode(200).log().all();
	}
	
	@Test(enabled = false)
	public void GetHooks() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/v1/hooks").then().statusCode(200).log().all();
	}
	
	@Test(enabled = false)
	public void getahookbyiD() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/v1/hooks/8e3aa909-fb84-4495-944d-a4c192defe66").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void deleteHookbyiD() {
		
	
		RestAssured.baseURI = url;
		given().when().delete("/v1/hooks/8e3aa909-fb84-4495-944d-a4c192defe66").then().statusCode(200).log().all();
	}
	
	@Test(enabled = true)
	public void getproject() {
		
	
		RestAssured.baseURI = url;
		given().when().put("/v1/projects/").then().statusCode(200).log().all();
	}
	


}
