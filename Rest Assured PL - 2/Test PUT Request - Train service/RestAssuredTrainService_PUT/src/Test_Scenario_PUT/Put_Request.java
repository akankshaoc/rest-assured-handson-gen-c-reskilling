package Test_Scenario_PUT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.json.JSONArray;
import org.junit.Assert;
import org.junit.Test;

import Sources.Train;
import Sources.HttpRequest;
import Sources.Train;
import Test_Scenario_PUT.Put_Request;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class Put_Request {

	public static HttpRequest http = new HttpRequest();
	public static Train train = new Train();
	public static List<Train> detailsInList = new ArrayList<Train>();

	public static RequestSpecification httpRequest;
	public static Response response;

	public static RequestSpecification createHttpRequest() throws IOException {
		// Write the code here
		httpRequest = given().accept(ContentType.JSON).contentType(ContentType.JSON).contentType(ContentType.URLENC)
				.baseUri("https://webapps.tekstac.com/TrainAPI/TrainService")
				.basePath("updateTrainTime");

		http.setHttpRequest(httpRequest);
		return httpRequest;
	}

	// PUT request
	public static Response sendPUTRequest(int trainNum, String startTime, String endTime) throws IOException {
		// Write the code here
		createHttpRequest();
		String bodyString = "trainNum=" + trainNum + "&startTime=" + startTime + "&endTime=" + endTime; 
		response = httpRequest.with().body(bodyString).when().put();
		http.setResponse(response);
		return response;
	}

	public static void setHttpRequest()throws IOException {
		// Write the code here
		sendPUTRequest(1001, "00:00", "00:00");
		http.setStatusCode(response.getStatusCode());
		http.setContentType(response.contentType());
	}

	@Test
	public void testStatusCode() throws IOException {
		// Write the assert code here
		setHttpRequest();
	}

	@Test
	public void testRequestHeaderType() throws IOException {
		// Write the assert code here
		setHttpRequest();
	}

	// Response in JSON Format
	public static void setDetailsInList() throws IOException {
		// Write the code here
		setHttpRequest();
		detailsInList = Arrays.asList(response.as(Train[].class));
	}

	public static void main(String[] args) throws IOException {
	    setHttpRequest();
		System.out.println(http.getStatusCode());
		System.out.println(http.getContentType());
		setDetailsInList();
		System.out.println(detailsInList);
	}

}
