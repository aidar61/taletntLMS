package API;

import UI.dataProviders.ConfigReader;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import org.junit.jupiter.api.Test;

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
                , Method.GET);
    }

    @Test
    public void createUser() {
        APIHelper.requestWithBody(ConfigReader.getProperty("createUser")
                , ConfigReader.getProperty("body")
                , ContentType.JSON, ContentType.JSON
                , Method.POST);
    }

}
