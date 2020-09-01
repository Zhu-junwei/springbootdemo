package com.zjw.springbootthymeleaf.controller;

import com.zjw.springbootthymeleaf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class PageController {

    @GetMapping("/show")
    public String show(Model model, HttpServletRequest request){
        model.addAttribute("msg","Hello Thymeleaf");
        model.addAttribute("date",new Date());
        model.addAttribute("id",2);
        //保存list集合
        List<User> users = new ArrayList<>();
        users.add(new User("张三","男",18));
        users.add(new User("李四","男",19));
        users.add(new User("王五","女",20));
        users.add(new User("赵六","女",21));
        model.addAttribute("users",users);
        //保存map集合
        Map<String,User> userMap = new HashMap<>();
        userMap.put("user1",new User("张三","男",18));
        userMap.put("user2",new User("李四","女",19));
        userMap.put("user3",new User("王五","男",20));
        model.addAttribute("userMap",userMap);
        //保存域对象中的值
        request.setAttribute("req","request中的值");
        request.getSession().setAttribute("ses","session中的值");
        request.getSession().getServletContext().setAttribute("app","application中的值");
        return "index";
    }

    @GetMapping("/show2")
    public String show2(String msg, Date date){
        System.out.println(msg);
        System.out.println(date);
        return "index2" ;
    }

    @GetMapping("/show3/{id}/{name}")
    public String show3(@PathVariable String id, @PathVariable String name){
        System.out.println(id+" "+name);
        return "index2" ;
    }

    @GetMapping("/show4/{id}")
    public String show4(@PathVariable String id, String name){
        System.out.println(id+" "+name);
        return "index2" ;
    }

    @GetMapping("/show5")
    public String show4(){
        return "test/myTest" ;
    }
}
