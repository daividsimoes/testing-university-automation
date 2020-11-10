package br.com.testinguniversity.automation.util;

import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class FakerUtils {

    private Faker faker;

    public FakerUtils(){

        faker = new Faker();
    }

    public String generateRandomUsername() {

        return faker.name().username();
    }

    public String generateRandomPassword() {

       return faker.regexify("[0-9]{2}[A-Z]{3}[a-z]{3}");
    }

    public String generateRandomCourseName() {

        return faker.educator().course();
    }

    public int GenerateRandomIntNumberBetween(int min, int max) {

        return faker.number().numberBetween(min, max);
    }
}
