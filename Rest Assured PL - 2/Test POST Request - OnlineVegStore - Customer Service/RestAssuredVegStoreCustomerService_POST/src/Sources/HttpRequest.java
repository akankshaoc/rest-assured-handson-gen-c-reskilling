package Sources;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class HttpRequest {
	
	RequestSpecification httpRequest;
	Response response;
	int statusCode;
	ResponseBody responsebody;
	String requestMethod;
	
	public String getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	public ResponseBody getResponseBody() {
		return responsebody;
	}
	public void setResponseBody(ResponseBody responsebody) {
		this.responsebody = responsebody;
	}
	public RequestSpecification getHttpRequest() {
		return httpRequest;
	}
	public void setHttpRequest(RequestSpecification httpRequest2) {
		this.httpRequest = httpRequest2;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}	 	  	      	  	      	  	    	    	 	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
