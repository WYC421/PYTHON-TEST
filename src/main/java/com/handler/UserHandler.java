package com.handler;


import com.entity.UserInfo;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserHandler {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/login")
    public String form(){
        return "login";
    }
    @GetMapping(value = "/index")
    public String forms(){
        return "index";
    }
    @RequestMapping ("/login")
    public String login(HttpServletRequest request, UserInfo userinfo){
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        userinfo=userService.login(name,pwd);
        if(userinfo!=null){
            return "redirect:/index";//到success的动态网页
        }
        return "redirect:/login";//这里是定向到login.html静态网页
    }
}