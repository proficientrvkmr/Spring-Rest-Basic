package com.practice.restdemo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Setter
@Getter
@Builder
public class Person {
    private String name;
    private String phoneNumber;
    private String city;
}
