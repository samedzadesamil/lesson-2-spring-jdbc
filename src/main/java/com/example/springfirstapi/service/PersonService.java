package com.example.springfirstapi.service;

import com.example.springfirstapi.dto.FullNamePerson;
import com.example.springfirstapi.entitiy.Person;
import com.example.springfirstapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;


    public FullNamePerson getPersonById(Long id) {
        return personRepository.getPersonById(id);
    }

    public String addPerson(Person person) {
        int control = personRepository.addPerson(person);
        if (control == 1) {
            return "person elave olundu";
        } else {
            return "elave olunmadi";
        }
    }

    public String deletePerson(long id) {
        int control = personRepository.deletePerson(id);
        if (control == 1) {
            return "person silindi";
        } else {
            return "silinmedi";
        }
    }

    public List<FullNamePerson> getPersonList() {
        return personRepository.getPersonList();
    }

    public List<Person> getPersonListDetail() {
        return personRepository.getPersonListDetail();
    }

}
