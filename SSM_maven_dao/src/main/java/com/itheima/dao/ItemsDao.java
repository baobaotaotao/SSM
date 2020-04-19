package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository("dao")
public interface ItemsDao {
//@Select("select * from items")
    List<Items> findAll();
}
