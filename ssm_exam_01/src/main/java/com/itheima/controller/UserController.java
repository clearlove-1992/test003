package com.itheima.controller;

import com.itheima.domian.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login.do")
    public String login(String username, String password, Model model) {
        try {
            User user = userService.doLogin(username, password);

            if (user != null) {
                //登录成功,将user存入session中,使用@SessionAttributes
                model.addAttribute("user", user);

                return "forward:/index.jsp";
            } else {
                //登录失败,则将失败信息存放到model中
                model.addAttribute("message", "用户名或密码错误");
                return "forward:/login.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            //登录失败则重定向到login.jsp页面
            model.addAttribute("message", "服务器异常");
            return "forward:/login.jsp";
        }
    }
}
