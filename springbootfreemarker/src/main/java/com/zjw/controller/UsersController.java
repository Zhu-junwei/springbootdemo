package com.zjw.controller;

import com.zjw.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    /**
     * 处理请求，返回数据
     */
    @GetMapping("/showUsers")
    public String showUsers(Model model){
        System.out.println("123");
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三","男","18"));
        userList.add(new User("张三2","男","19"));
        userList.add(new User("张三3","男","20"));
        model.addAttribute("userList",userList);
        return "userList";
    }
}
