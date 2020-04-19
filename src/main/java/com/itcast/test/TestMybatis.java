package com.itcast.test;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
  @Test
    public void testRun1() throws Exception {
      InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
      SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
      SqlSession session = factory.openSession();
      AccountDao dao = session.getMapper(AccountDao.class);
      List<Account> all = dao.findAll();
      for (Account account : all) {
        System.out.println(account);
      }
      session.close();
      is.close();
  }

  @Test
  public void testRun2() throws Exception {
    Account account=new Account();
    account.setName("贼眉鼠眼");
    account.setMoney(1000d);
    InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
    SqlSession session = factory.openSession();
    AccountDao dao = session.getMapper(AccountDao.class);
    dao.add(account);

    session.commit();
    session.close();
    is.close();
  }
}
