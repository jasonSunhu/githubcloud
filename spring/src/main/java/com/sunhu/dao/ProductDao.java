package com.sunhu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/6/4.
 */
@Repository
public class ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(String name){
        String sql = "insert into product (id,name) values (1,'"+name+"')";
        jdbcTemplate.update(sql);
    }
}
