package Test_Scenario_GET;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.json.JSONArray;
import org.junit.Assert;
import org.junit.Test;

import Sources.HttpRequest;
import Sources.VegStore;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

//DO NOT CHANGE THE CLASS NAME. DO NOT CHANGE THE METHOD SIGNATURE
public class Get_Request {

	// DO NOT CHANGE THE ATTRIBUTES.

	public static VegStore vegStore = new VegStore();
	public static HttpRequest http = new HttpRequest();
	public static List<VegStore> customerList = new ArrayList<VegStore>();

	public static RequestSpecification httpRequest;
	public static Response response;

	public static FileInputStream stream;
	public static Properties propertyFile = new Properties();
	public static String RepositoryFile = "Repository.properties";

	public static FileInputStream setRepositoryFile(String fileName) throws IOException {
		stream = new FileInputStream(fileName);
		propertyFile.load(stream);
		return stream;
	}

	public static String getBaseURI(FileInputStream stream) throws IOException {
		return propertyFile.getProperty("baseURI");
	}

	public static String getAccept(FileInputStream stream) throws IOException {
		return propertyFile.getProperty("Accept");
	}

	public static RequestSpecification getRequest() throws IOException {
		setHttpRequest();
		httpRequest = given().accept(getAccept(stream)).baseUri(getBaseURI(stream));
		http.setHttpRequest(httpRequest);
		return httpRequest;
	}

	public static Response sendRequest() throws IOException {
		response = getRequest().when().get();
		http.setResponse(response);
		http.setStatusCode(response.getStatusCode());
		return response;
	}

	public static void setHttpRequest() throws IOException {
		http.setContentType(getAccept(stream));
		http.setRequestMethod("GET");
	}

	public static void setDetailsInList() throws IOException {
		customerList = Arrays.asList(sendRequest().as(VegStore[].class));
	}

	
	@Test
	public void testStatusCode() throws IOException {
		Assert.assertEquals(200, sendRequest().statusCode());
	}

	@Test
	public void testContentType() throws IOException {
		Assert.assertEquals("application/json", sendRequest().contentType());
	}
	
	public static void main(String[] args) throws IOException {
		// 'main' method is for your reference and it is NOT evaluated
		// Use the filepath "Repository.properties" to pass the filename as argument
		// from the main
	}

}
