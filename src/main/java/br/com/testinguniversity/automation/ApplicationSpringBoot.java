package br.com.testinguniversity.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackages = {"br.com.testinguniversity.automation"})
public class ApplicationSpringBoot {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationSpringBoot.class, args);

    }
}
