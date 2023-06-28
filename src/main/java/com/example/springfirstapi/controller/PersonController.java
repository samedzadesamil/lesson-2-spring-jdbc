package com.example.springfirstapi.controller;

import com.example.springfirstapi.dto.FullNamePerson;
import com.example.springfirstapi.entitiy.Person;
import com.example.springfirstapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public FullNamePerson getPersonById(@PathVariable long id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/add")
    public String addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable long id) {
        return personService.deletePerson(id);
    }

    @GetMapping()
    public List<FullNamePerson> getPersonList() {
        return personService.getPersonList();
    }

    @GetMapping("/details")
    public List<Person> getPersonListDetail() {
        return personService.getPersonListDetail();
    }
}
