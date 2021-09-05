package resources;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {

	RequestSpecification req;
	public RequestSpecification requestSpecification() 
	{
		RestAssured.baseURI = "https://stage-api.whjr.one";

		req = new RequestSpecBuilder().setBaseUri("https://stage-api.whjr.one")
				.setContentType(ContentType.JSON).build();
		return req;
	}
	

}
