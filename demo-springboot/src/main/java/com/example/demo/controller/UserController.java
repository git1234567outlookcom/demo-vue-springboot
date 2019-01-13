package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.jvm.hotspot.debugger.Page;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @create: 20181231
 * @author: liu
 **/


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @description:页面跳转
     * @create: 12/31/18
     * @author: liu
     **/

    @RequestMapping("/{page}")
    public Page showPage(@PathVariable Page page) {
        return page;
    }

    // 添加用户
    @RequestMapping("/userAdd")
    public String addUser(@RequestBody User user) {
        System.out.println(user.toString());
        this.userService.addUser(user);
        return "ok";
    }


}
