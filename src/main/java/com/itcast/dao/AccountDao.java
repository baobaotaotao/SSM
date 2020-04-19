package com.itcast.dao;

import com.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dao")
public interface AccountDao {
    //查询所有
     @Select("select * from account")
    List<Account> findAll();

    //添加
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void add(Account account);
}
