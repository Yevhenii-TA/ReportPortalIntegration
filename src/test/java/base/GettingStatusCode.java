package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GettingStatusCode {
    public int GetStatusCode(String url) {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(url);
        int statusCode = response.getStatusCode();
        return statusCode;
    }
    public int PostStatusCode(String url) {
        return RestAssured.post(url).statusCode();
    }
}
