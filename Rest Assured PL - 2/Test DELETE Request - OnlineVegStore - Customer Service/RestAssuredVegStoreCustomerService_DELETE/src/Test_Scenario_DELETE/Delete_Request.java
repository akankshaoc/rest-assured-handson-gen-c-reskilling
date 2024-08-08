package Test_Scenario_DELETE;

import org.junit.Test;
import org.junit.Assert;

import Sources.HttpRequest;
import Sources.VegStore;
import java.io.IOException;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class Delete_Request {

	public static VegStore vegstore = new VegStore();
	public static HttpRequest http = new HttpRequest();

	public static RequestSpecification httpRequest;
	public static Response response;

	public static RequestSpecification deleteRequest() {
		// write the code here
		httpRequest = given()
				.baseUri("https://webapps.tekstac.com/OnlineVegStoreAPI/CustomerService/deleteCustomerById")
				.basePath("{num}").accept(ContentType.JSON);
		http.setHttpRequest(httpRequest);
		return httpRequest;
	}

	public static Response deleteResponse(int num) {
		deleteRequest();
		response = httpRequest.pathParam("num", num).when().delete();
		http.setResponse(response);
		return response;
	}

	public static void setHttpDetails() {
	    deleteResponse(1001);
		http.setContentType(response.contentType());
		http.setStatusCode(response.getStatusCode());
		http.setRequestMethod("DELETE");
	}

	public static void setVegStoreDetails() {
		// 1. read response of customer 1001
		Response resp = given().baseUri("https://webapps.tekstac.com/OnlineVegStoreAPI/CustomerService")
				.basePath("viewCustomerById/1002").contentType(ContentType.JSON).when().get();

		// 2. set details
		vegstore.setCustomerId(Integer.parseInt(resp.xmlPath().getString("customer.customerId")));
		vegstore.setCustomerEmail(resp.xmlPath().getString("customer.customerEmail"));
		vegstore.setCustomerMobile(resp.xmlPath().getString("customer.customerMobile"));
		vegstore.setCustomerName(resp.xmlPath().getString("customer.customerName"));
		vegstore.setCustomerUsername(resp.xmlPath().getString("customer.customerUsername"));
		vegstore.setCustomerAddress(resp.xmlPath().getString("customer.customeraddress"));
		vegstore.setCustomerPassword(resp.xmlPath().getString("customer.customerPassword"));

	}

	@Test
	public void testStatusCode() throws IOException {
		setHttpDetails();
		Assert.assertEquals(200, http.getStatusCode());
	}

	@Test
	public void testRequestMethod() throws IOException {
		setHttpDetails();
		Assert.assertEquals("DELETE", http.getRequestMethod());
	}

	public static void main(String[] args) throws IOException {
		// 'main' method is NOT evaluated. You can have your own implementation
		setVegStoreDetails();
        System.out.println(vegstore);
        setHttpDetails();
        setVegStoreDetails();
        System.out.println(vegstore);
        System.out.println(http.getStatusCode());
        System.out.println(http.getRequestMethod());
	}

}
