package API.practice;

import com.google.gson.Gson;

public class TestCar {
    public static void main(String[] args) {
        String carPayLoad = "{\n" +
                "    \"name\": \"Mercedes\",\n" +
                "    \"model\": \"W221\",\n" +
                "    \"color\": \"BlackMamba\"\n" +
                "  }";

         Gson gson = new Gson();
        Car car = gson.fromJson(carPayLoad, Car.class);

        System.out.println(car.getModel());

        Car car1 = new Car();
        car1.setName("BMW");
        car1.setModel("G30 Competition");
        car1.setColor("White");

        String bmw = gson.toJson(car1);
        System.out.println(bmw);

    }
}
