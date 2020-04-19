package com.itcast.test;

import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    @Test
    public void testRun1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as= (AccountService) ac.getBean("accountService");
        as.findAll();
    }
    @Test
    public void testRun2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as= (AccountService) ac.getBean("accountService");
        Account account=new Account();
        account.setName("aaa");
        account.setMoney(10d);
        as.add(account);
    }
}
