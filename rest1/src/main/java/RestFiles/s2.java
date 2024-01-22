package RestFiles;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class s2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	given().
		baseUri("https://coupon-service-api.dev.svc.jahez.net").
		header("tenantId","2").
	
	when().
		get("/api/v1/Coupons/44").
	
		
	then().
		log().all().
		assertThat().
		statusCode(200) ; 
	
	
	}

}
