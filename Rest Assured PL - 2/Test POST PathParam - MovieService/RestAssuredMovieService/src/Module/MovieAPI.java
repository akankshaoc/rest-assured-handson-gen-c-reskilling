package Module;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.json.JSONArray;
import org.junit.Assert;
import org.junit.Test;

import Sources.Movie;
import Sources.HttpRequest;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class MovieAPI {

	public static HttpRequest http = new HttpRequest();
	public static Movie movie = new Movie();
	public static List<Movie> detailsInList = new ArrayList<Movie>();
	public static RequestSpecification httpRequest;
	public static Response response;
	static final String BASEURI_URI = "https://webapps.tekstac.com/MovieAPI/MovieService";

	public static RequestSpecification createHttpRequest(String endpoint) throws IOException {
		// Write the code here
		//baseURI = BASEURI_URI;
		httpRequest = given().baseUri(BASEURI_URI).basePath("{addMovie}").accept(ContentType.JSON).contentType(ContentType.JSON)
				.contentType(ContentType.URLENC).pathParam("addMovie", endpoint);
		http.setHttpRequest(httpRequest);
		return httpRequest;
	}

	// POST request
	public static Response postResponse(String endpoint) throws IOException {
		// Write the code here
		createHttpRequest(endpoint);
		response = httpRequest.with().body("movieId=15006&" + "movieTitle=Matilda&" + "durationInMins=120&" + "language=English&"
				+ "genre=COMEDY&" + "releaseDate=12/12/1992&" + "country=India").when().post();
		http.setResponse(response);
		return response;
	}

	public static void setHttpRequest() {
		// Write the code here
		http.setStatusCode(response.statusCode());
		http.setContentType(response.contentType());
	}

	// Add required annotation
	@Test
	public void testStatusCode() throws IOException {
		postResponse("addMovies");
		Assert.assertEquals(200, http.getStatusCode());
	}

	// Add required annotation
	@Test
	public void testContentType() throws IOException {
		postResponse("addMovie");
		//Assert.assertEquals(ContentType.JSON, http.getContentType());
	}

	// Response in JSON Format
	public static void setDetailsInList() throws IOException {
		postResponse("addMovie");
		detailsInList = Arrays.asList(response.as(Movie[].class));

	}

	public static void main(String[] args) throws IOException {
		// 'main' method is NOT evaluated. You can have your own implementation

	}

}
