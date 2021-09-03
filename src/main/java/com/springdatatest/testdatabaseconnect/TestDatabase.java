package com.springdatatest.testdatabaseconnect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestDatabase {
    @Autowired
    JdbcTemplate template;
}
