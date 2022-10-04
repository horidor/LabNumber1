package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
//@Order(2)
public class HelloWorldApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Begin of the main");
        SpringApplication.run(HelloWorldApplication.class, args);
        System.out.println("End of the main");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from run function!");
    }


}

/*@Component
@Order(1)
class HelloWorldFirst implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("First! :)");
    }
}

@Component
@Order(3)
class HelloWorldSecond implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Second... :(");
    }
}*/
