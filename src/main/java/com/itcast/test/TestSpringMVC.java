package com.itcast.test;

import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class TestSpringMVC {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/find")
    public String testSpringMVC(Model model){
        System.out.println("查询方法执行了。。。。。。。。。。");
        List<Account> list = accountService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/addService")
    public void testAddService(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
       accountService.add(account);
       response.sendRedirect(request.getContextPath()+"/account/find");
    }
}
