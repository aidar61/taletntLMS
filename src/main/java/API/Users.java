package API;

import UI.dataProviders.ConfigReader;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.Reader;

public class Users {
    @Test
    public void getUser() {
        APIHelper.getUsersByID(1);
    }

    @Test
    public void getAllUsers() {
        APIHelper.request(ConfigReader.getProperty("users")
                , ContentType.JSON
                , ContentType.JSON
                , Method.GET).body();
    }

    @Test
    public void createUser() {
        File file = new File("src/main/resources/user.json");
        JsonPath jsonPath = new JsonPath(file);
        APIHelper.requestWithBody(ConfigReader.getProperty("createUser")
                , jsonPath.get()
                , ContentType.JSON, ContentType.JSON
                , Method.POST);
    }
}
