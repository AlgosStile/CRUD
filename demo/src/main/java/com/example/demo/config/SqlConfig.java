package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class SqlConfig {

    /**
     * SQL-запрос для поиска всех пользователей.
     */
    @Value("${sql.user.findAll}")
    private String findAllSql;

    /**
     * SQL-запрос для сохранения пользователя.
     */
    @Value("${sql.user.save}")
    private String saveSql;

    /**
     * SQL-запрос на удаление пользователя по идентификатору.
     */
    @Value("${sql.user.deleteById}")
    private String deleteSql;

    /**
     * SSQL-запрос для поиска пользователя по идентификатору.
     */
    @Value("${sql.user.findById}")
    private String findByIdSql;

    /**
     * SQL-запрос для обновления пользователя.
     */
    @Value("${sql.user.update}")
    private String updateSql;

}