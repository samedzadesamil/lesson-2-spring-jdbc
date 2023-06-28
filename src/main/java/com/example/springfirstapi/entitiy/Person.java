package com.example.springfirstapi.entitiy;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private long id;
    private String name;
    private String surname;
    private String email;
    private String location;
}
