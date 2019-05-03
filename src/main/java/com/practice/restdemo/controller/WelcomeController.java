package com.practice.restdemo.controller;

import com.practice.restdemo.model.Person;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class WelcomeController {

    /**
     * ENDPOINT - http://localhost:8080?name={RAVI}
     * TYPE - GET
     *
     * @param name of person.
     * @return return predefined welcome message.
     */
    @GetMapping("/")
    public String welcome(@RequestParam("name") String name) {
        return "Hi " + name + ", Welcome Back Here !!! ";
    }

    /**
     * ENDPOINT - http://localhost:8080/about
     * TYPE - GET
     *
     * @return return welcome message.
     */
    @GetMapping("/about")
    public Person aboutMe() {
        Person person = Person.builder()
                .city("NOIDA")
                .name("Anil")
                .phoneNumber("3453453453534534")
                .build();

        return person;
    }
}
