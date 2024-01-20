package com.example.demo.repositories;

import com.example.demo.config.SqlConfig;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbc;
    private final SqlConfig sqlConfig;

    @Autowired
    public UserRepository(JdbcTemplate jdbc, SqlConfig sqlConfig) {
        this.jdbc = jdbc;
        this.sqlConfig = sqlConfig;
    }

    public List<User> findAll() {
        RowMapper<User> userRowMapper = (rs, rowNum) -> {
            User rowObject = new User();
            rowObject.setId(rs.getInt("id"));
            rowObject.setFirstName(rs.getString("firstName"));
            rowObject.setLastName(rs.getString("lastName"));
            return rowObject;
        };

        return jdbc.query(sqlConfig.getFindAllSql(), userRowMapper);
    }

    public User save(User user) {
        jdbc.update(sqlConfig.getSaveSql(), user.getFirstName(), user.getLastName());
        return user;
    }

    public void deleteById(int id) {
        jdbc.update(sqlConfig.getDeleteSql(), id);
    }

    public User findById(int id) {
        return jdbc.queryForObject(sqlConfig.getFindByIdSql(), new Object[]{id}, (rs, rowNum) ->
                new User(
                        rs.getInt("id"),
                        rs.getString("firstName"),
                        rs.getString("lastName")
                ));
    }

    public User update(User user) {
        jdbc.update(sqlConfig.getUpdateSql(), user.getFirstName(), user.getLastName(), user.getId());
        return findById(user.getId());
    }
}

