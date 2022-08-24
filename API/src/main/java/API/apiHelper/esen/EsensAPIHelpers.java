package API.apiHelper.esen;

import API.dataProviders.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class EsensAPIHelpers {

    private static RequestSpecification authURIPATH(String endPoint) {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.auth()
                .basic(ConfigReader.getProperty("userNameAPI"), ConfigReader.getProperty("passwordAPI"))
                .baseUri(ConfigReader.getProperty("baseUri"))
                .basePath(ConfigReader.getProperty("basePath") + endPoint);
        return requestSpecification;
    }


    public static RequestSpecification preRequest(String endPoint) {
        return authURIPATH(endPoint)
                .contentType(ContentType.JSON).accept(ContentType.JSON);
    }

    public static String requestWithQueryParams(String endPoint, String key, String value, Method method) {
        return preRequest(endPoint)
                .queryParam(key, value)
                .request(method).getBody().asPrettyString();
    }

    public static int getStatusCode(String endPoint, Method method){
       return preRequest(endPoint).request(method).getStatusCode();
    }








}
