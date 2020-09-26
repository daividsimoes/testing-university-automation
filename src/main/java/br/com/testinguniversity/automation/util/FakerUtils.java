package br.com.testinguniversity.automation.util;

import java.util.Locale;

import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class FakerUtils {

    private Faker faker;

    public FakerUtils(){

        faker = new Faker(new Locale("pt-BR"));
    }

    public String generateRandomUsername() {

        return faker.name().username();
    }

    public String generateRandomPassword() {

       return faker.regexify("[A-Za-z1-9]{8}");
    }
}
