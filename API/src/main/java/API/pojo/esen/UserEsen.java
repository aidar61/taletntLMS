package API.pojo.esen;


import API.apiHelper.aidar.APIHelper;
import API.apiHelper.aidar.SDConverter;
import API.apiHelper.esen.EsensAPIHelpers;
import API.dataProviders.ConfigReader;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import lombok.Data;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEsen {
    private String id;
    private String login;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String restrict_email;
    private String user_type;
    private String timezone;
    private String language;
    private String status;
    private String deactivation_date;
    private String level;
    private String points;
    private String created_on;
    private String last_updated;
    private String last_updated_timestamp;
    private String avatar;
    private String bio;
    private String login_key;


//    public String getUserByUserName(String userName) {
//        return EsensAPIHelpers.preRequest(URI.USERS.endPoint + URI.USERBYUSERNAME.endPoint + userName).request(Method.GET).asPrettyString();
//
//    }

    public int checkStatusCode() {

//        Assertions.assertEquals(EsensAPIHelpers.getStatusCode(URI.USERBYUSERNAME.endPoint+userName,Method.GET),code);
//        MatcherAssert.assertThat(code, Matchers.is(EsensAPIHelpers.getStatusCode(URI.USERS.endPoint + URI.USERBYUSERNAME.endPoint + userName, Method.GET)));
       int code = APIHelper.preRequest(URI.USERS.endPoint).queryParam("username", "Ezan23").request(Method.GET).getStatusCode();
        return code;
    }


    public String getUserByUserName2() {
      return APIHelper.requestWithQueryParams(URI.USERS.endPoint, "username", "Ezan23", Method.GET);
    }


    public String getUsersStatusByID(){
        return EsensAPIHelpers.requestWithQueryParams(URI.USERSISONLINE.endPoint, "user_id","1",Method.GET);
    }

    public int checkStatusCode2(){
        return EsensAPIHelpers.preRequest(URI.USERSISONLINE.endPoint).queryParam("user_id","1").request(Method.GET).getStatusCode();
    }

    public String isUserOnline(){
        return EsensAPIHelpers.preRequest(URI.USERSISONLINE.endPoint).queryParam("user_id","1").request(Method.GET).getBody().asPrettyString();
    }

    public Response deleteUser(int userID){

       return EsensAPIHelpers.preRequest(URI.DELETEUSER.endPoint).
               contentType(ConfigReader.getProperty("multipart")).multiPart("user_id", userID).request(Method.POST);
    }

    public void deleteUser36(){
        System.out.println(deleteUser(35).getStatusCode());
        System.out.println(deleteUser(35).getBody().asPrettyString());
    }



}
