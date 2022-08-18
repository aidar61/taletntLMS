package UI.dataProviders;

import com.github.javafaker.Faker;

public class EsensMockDataGenerator {
    Faker faker = new Faker();


    public String nameGenerator(){
        return faker.name().username();
    }

    public int GenerateNumberFrom1To33(){
        return faker.number().numberBetween(1,33);
    }
    public int GenerateNumberFrom1To4(){
        return faker.number().numberBetween(1,4);
    }
}
