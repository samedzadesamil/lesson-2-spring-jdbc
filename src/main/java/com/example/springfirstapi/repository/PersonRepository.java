package com.example.springfirstapi.repository;

import com.example.springfirstapi.dto.FullNamePerson;
import com.example.springfirstapi.entitiy.Person;
import com.example.springfirstapi.mapper.FullNamePersonRowMapper;
import com.example.springfirstapi.mapper.PersonRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    private final JdbcTemplate jdbcTemplate;

    public PersonRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public FullNamePerson getPersonById(Long id) {
        String sql = "select * from persons where(id=?)";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new FullNamePersonRowMapper());
    }

    public List<FullNamePerson> getPersonList() {
        String sql = "select * from persons";
        return jdbcTemplate.query(sql, new FullNamePersonRowMapper());
    }

    public List<Person> getPersonListDetail() {
        String sql = "select * from persons";
        return jdbcTemplate.query(sql, new PersonRowMapper());
    }

    public int deletePerson(long id) {
        String sql = "delete from persons where(id=?)";
        //silinse 1 qaytarar
        return jdbcTemplate.update(sql, id);
    }

    public int addPerson(Person person) {
        String sql = "insert into persons(name,surname,email,location) values(?,?,?,?)";
        //elave olunsa 1 qaytarar
        return jdbcTemplate.update(sql, person.getName(), person.getSurname(), person.getEmail(), person.getLocation());
    }


}
