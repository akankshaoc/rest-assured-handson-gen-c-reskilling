package Test_Scenario_POST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Sources.HttpRequest;
import Sources.VegStore;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//DO NOT CHANGE THE CLASS NAME. DO NOT CHANGE THE METHOD SIGNATURE

public class Post_Request {

	// DO NOT CHANGE THE ATTRIBUTES.
	public static VegStore vegstore = new VegStore();
	public static HttpRequest http = new HttpRequest();
	public static List<VegStore> customerList = new ArrayList<VegStore>();

	public static RequestSpecification httpRequest;
	public static Response response;

	public static RequestSpecification createRequest() {
		httpRequest = given().contentType(ContentType.JSON).contentType(ContentType.URLENC);
		http.setHttpRequest(httpRequest);
		return httpRequest;
	}

	public static Response sendPOSTRequest() {
		// write the code here
		createRequest();
		String bodyString = "customerId=1003&customerName=Sam&customerMobile=9897123432&customerEmail=sam@email.com&customeraddress=Mumbai&customerUsername=sam&customerPassword=sam";
		response = httpRequest.with().body(bodyString).post();
		http.setResponse(response);

		return response;
	}

	public static void setHttpDetails() {
		// write the code here
		http.setResponseBody(response.body());
		http.setStatusCode(response.statusCode());
		http.setRequestMethod("POST");

	}

	@Test
	public void testStatusCode() throws IOException {
		sendPOSTRequest();
		Assert.assertEquals(200, http.getStatusCode());

	}

	@Test
	public void testRequestMethod() throws IOException {
		// write the code here
		sendPOSTRequest();
		Assert.assertEquals("POST", http.getRequestMethod());
	}

	@Test
	public void testGetbody() throws IOException {
		sendPOSTRequest();
		Assert.assertNotNull(http.getResponseBody());
	}

	// Response in JSON Format
	public static void setDetailsInList() {
		sendPOSTRequest();
		customerList = Arrays.asList(response.as(VegStore[].class));
	}

	public static void main(String[] args) throws IOException {
		// 'main' method is for your reference and it is NOT evaluated

	}

}