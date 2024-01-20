package com.example.demo.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class SqlConfig {

    @Value("${sql.user.findAll}")
    private String findAllSql;

    @Value("${sql.user.save}")
    private String saveSql;

    @Value("${sql.user.deleteById}")
    private String deleteSql;

    @Value("${sql.user.findById}")
    private String findByIdSql;

    @Value("${sql.user.update}")
    private String updateSql;

}