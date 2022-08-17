package API.Users;

import API.APIHelper;
import UI.dataProviders.ConfigReader;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.io.File;

public class Users {
    File file = new File("src/main/resources/user.json");
    JsonPath localJsonPath = new JsonPath(file);

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
                , localJsonPath.get()
                , ContentType.JSON, ContentType.JSON
                , Method.POST);
    }

    @Test
    public void deleteUser() {
        JsonPath jsonPath = APIHelper.getJSON().jsonPath();
        int id = jsonPath.getInt("[0].id");
        System.out.println(id);
    }

    @Test
    public void testJsonPath(){
        String email = localJsonPath.getString("email");
        System.out.println(email);
    }

}
