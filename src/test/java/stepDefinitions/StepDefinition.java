package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.RegisterPayload1;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinition extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();
	
	@Given("minimalFieldRegister payload")
	public void minimal_field_register_payload() {

		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		res = given().spec(requestSpecification()).body(data.RegisterPayload());
	}

	@When("user calls minimalFieldRegister API with Post http request")
	public void user_calls_minimal_field_register_api_with_post_http_request() {

		response = res.when().post("/api/V1/trial/users/minimalFieldRegister").then().spec(resspec).assertThat()
				.statusCode(200).extract().response();

	}

	@Then("API call is success with status code {int}")
	public void api_call_is_success_with_status_code(Integer int1) {

		assertEquals(response.getStatusCode(), 200);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String expectedValue) {

		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		assertEquals(js.get(keyValue).toString(), expectedValue);
	}

}
