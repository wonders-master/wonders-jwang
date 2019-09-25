package com.wonders.controller;

import com.wonders.bo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/show_jsp")
    public String hello(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users(1, "张三", 25));
        list.add(new Users(2, "李四", 26));
        list.add(new Users(3, "王五", 27));
        list.add(new Users(4, "赵六", 28));
        model.addAttribute("userList", list);
        return "user_list";
    }
}
