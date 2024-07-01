package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    record User(int id, String name) {}
    public List<User> getUsers() {
        return List.of(new User(1, "Alice"), new User(2, "Bob"));
    }

}
