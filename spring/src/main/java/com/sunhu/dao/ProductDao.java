package com.sunhu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

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
    //直接调用的方法，需要有注解
    @Transactional//(rollbackFor = Exception.class)设置对所有异常进行回滚
                  //(noRollbackFor = )设置对哪些异常不会滚
    public void updateProducts(String ... names) throws FileNotFoundException {
        add(names);
    }
    //间接调用的方法有无注解均可
    @Transactional
    public void add(String ... names){
        for (String name:names) {
            String sql = "insert into product (id,name) values (1,'"+name+"')";
            jdbcTemplate.update(sql);
            if("".equals(name)){
                //默认不会回滚事务，springboot 默认只会滚运行时异常
                //throw new FileNotFoundException();
                //会回滚
                throw new NullPointerException();
            }
        }
    }
}
