package UI.dataProviders;

import com.github.javafaker.Faker;

public class MOCKDataGenerator {
    Faker faker = new Faker();

    public String generateCourseName(){
        return faker.pokemon().name();
    }

    public String descriptiontextGenerate(){
        return faker.superhero().power();
    }

    public int generateCourseCode(){
        return faker.number().randomDigit();
    }

    public int generatePrice(){
        return faker.number().randomDigit();
    }

    public int generateCapacity(){
        return faker.number().numberBetween(1,20);
    }

    public int generateTimeLimitDays(){
        return faker.number().numberBetween(1,20);
    }


}
