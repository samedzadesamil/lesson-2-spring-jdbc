package com.example.springfirstapi.mapper;

import com.example.springfirstapi.dto.FullNamePerson;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FullNamePersonRowMapper implements RowMapper<FullNamePerson> {
    @Override
    public FullNamePerson mapRow(ResultSet rs, int rowNum) throws SQLException {
        FullNamePerson namePerson=new FullNamePerson();
        namePerson.setName(rs.getString("name"));
        namePerson.setSurname(rs.getString("surname"));
        return namePerson;
    }
}
