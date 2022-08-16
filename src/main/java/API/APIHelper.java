package API;

import UI.dataProviders.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class APIHelper {
    private static RequestSpecification authURIPATH(String path) {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.auth()
                .basic(ConfigReader.getProperty("userNameAPI"), ConfigReader.getProperty("passwordAPI"))
                .baseUri(ConfigReader.getProperty("baseUri"))
                .basePath(ConfigReader.getProperty("basePath") + path);
        return requestSpecification;
    }


    public static Response request(String path, ContentType contentType, ContentType accept, Method method) {
        Response response = authURIPATH(path)
                .contentType(contentType).accept(accept)
                .request(method);
        System.out.println(response.getBody().asPrettyString() + "\n" + response.getStatusCode());
        return response;
    }

    public static void requestWithQueryParams(String path, String key, String value, ContentType contentType, ContentType accept, Method method) {
        Response response = authURIPATH(path).queryParam(key, value)
                .contentType(contentType)
                .accept(accept)
                .request(method);
        System.out.println(response.getBody().asPrettyString() + "\n" + response.getStatusCode());
    }

    public static <T> void requestWithBody(String path, T body, ContentType contentType, ContentType accept, Method method) {
        Response response = authURIPATH(path).body(body)
                .contentType(contentType).accept(accept)
                .request(method);
        System.out.println(response.getBody().asPrettyString() + "\n" + response.getStatusCode());
    }

    public static void getUsersByID(int id) {
        APIHelper.requestWithQueryParams(ConfigReader.getProperty("users"),
                "id", String.valueOf(id)
                , ContentType.JSON, ContentType.JSON
                , Method.GET);
    }
    public static void deleteUser(int id) {

    }
}
