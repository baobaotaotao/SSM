package com.itheima.serivce.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.serivce.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao dao;

    public List<Items> findAll() {
        List<Items> all = dao.findAll();
        return all;
    }
}
