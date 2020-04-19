package com.itcast.service.impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
   @Autowired
    private AccountDao dao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询执行了。。。。。。");

        List<Account> all = dao.findAll();
        return all;
//        return null;
    }

    @Override
    public void add(Account account) {
        System.out.println("业务层：添加执行了。。。。。。");
        dao.add(account);
    }
}
