package API.practice;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarDemo {
    public static void main(String[] args) {


        ObjectMapper objectMapper = new ObjectMapper();

        String carPayLoad = "{\n" +
                "    \"name\": \"Mercedes\",\n" +
                "    \"model\": \"W221\",\n" +
                "    \"color\": \"BlackMamba\"\n" +
                "  }";



    }

}
