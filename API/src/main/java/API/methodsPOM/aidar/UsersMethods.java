package API.methodsPOM.aidar;

import API.apiHelper.aidar.APIHelper;
import API.apiHelper.aidar.SDConverter;
import API.dataProviders.ConfigReader;
import API.dataProviders.MockDataGenerator;
import API.dataProviders.URI;
import API.pojo.aidar.UsersPOJO;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.io.File;

public class UsersMethods extends MockDataGenerator {
    File file = new File("src/main/resources/user.json");
    JsonPath localJsonPath = new JsonPath(file);
    UsersPOJO usersPOJO = new UsersPOJO();


    @Test
    public void getUser() {
        System.out.println(UsersPOJO.getUserByValue("email", "errol.anderson@gmail.com"));
    }

    @Test
    public void createUsers() {
        try {
            usersPOJO.createSomeUsersWithMock(4);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void deleteUser() {
        try {
            usersPOJO.deleteUser(1);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void createMaxUser() throws JsonProcessingException {
        String json = "";
        for (int i = 0; i < 4; i++) {
            UsersPOJO usersPOJO = new UsersPOJO();
            usersPOJO.setFirst_name(generateMockFirstname());
            usersPOJO.setLast_name(generateLastname());
            usersPOJO.setEmail(generateEmail());
            usersPOJO.setLogin(generateMockLogin());
            usersPOJO.setPassword("Nomad.o123c");
            json = SDConverter.serialize(usersPOJO);
            APIHelper.requestWithBody(URI.CREATEUSER.endpoints
                    , json

                    , Method.POST);
        }
        UsersPOJO[] usersPOJOS = SDConverter
                .deserialize(APIHelper.getJSON(URI.USERS.endpoints, Method.GET)
                        , UsersPOJO[].class);
        System.out.println(usersPOJOS.length);
    }

    @Test
    public void deletesAllUsers() throws JsonProcessingException {
        UsersPOJO[] usersPOJOS = SDConverter.deserialize(APIHelper
                .getJSON(URI.USERS.endpoints, Method.GET), UsersPOJO[].class);
        for (int i = 1; i < usersPOJOS.length; i++) {
            System.out.println(APIHelper.preRequest(URI.DELETEUSER.endpoints
                    )
                    .contentType("multipart/form-data")
                    .multiPart("user_id", usersPOJOS[i].getId()).request(Method.POST)
                    .getBody().asPrettyString());
        }
    }
}
