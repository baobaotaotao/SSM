package com.itheima.Controller;

import com.itheima.domain.Items;
import com.itheima.serivce.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("test")
public class Item {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("a")
    public String testController(Model model){
        List<Items> all = itemsService.findAll();
        model.addAttribute("item",all);
        return "success";
    }
}
