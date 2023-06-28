package com.example.springfirstapi.mapper;

import com.example.springfirstapi.entitiy.Person;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getLong("id"));
        person.setName(rs.getString("name"));
        person.setSurname(rs.getString("surname"));
        person.setEmail(rs.getString("email"));
        person.setLocation(rs.getString("location"));
        return person;
    }
}
