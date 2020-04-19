package com.itcast.service;

import com.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    List<Account> findAll();

    //添加
    void add(Account account);
}
