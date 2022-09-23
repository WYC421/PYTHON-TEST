package com.handler;


import com.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.UserInfoService;

import java.util.List;

@Controller
public class UserInfoHandler {
    //自动装配
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll() {
        System.out.println(this.userInfoService.getAllUser());
        return this.userInfoService.getAllUser();
    }

    /**
     * 用户注册
     *
     * @param
     * @return 1001 注册成功  ， 1002 用户已存在  1003 注册失败
     */

    @GetMapping(value = "/register")
    public String form1(){
        return "register";
    }


    @GetMapping(value = "/Project")
    public String form2(){
        return "Project";
    }

    @GetMapping(value = "/资讯信息")
    public String form3(){
        return "资讯信息";
    }

    @GetMapping(value = "/北京大学")
    public String form4(){
        return "北京大学";
    }

    @GetMapping(value = "/联系我们")
    public String form5(){
        return "联系我们";
    }

    @GetMapping(value = "/关于我们")
    public String form6(){
        return "关于我们";
    }

    @GetMapping(value = "/投票项目")
    public String form7(){
        return "投票项目";
    }

    @GetMapping(value = "/投票项目1")
    public String form8(){
        return "投票项目1";
    }

    @GetMapping(value = "/投票项目2")
    public String form9(){
        return "投票项目2";
    }

    @GetMapping(value = "/投票项目5")
    public String form10(){
        return "投票项目5";
    }

    @GetMapping(value = "/关于住宿")
    public String for1(){return "关于住宿";}

    @GetMapping(value = "/关于食堂")
    public String for2(){return "关于食堂";}

    @GetMapping(value = "/关于生活")
    public String for3(){return "关于生活";}

    @GetMapping(value = "/其他投票")
    public String for4(){return "其他投票";}

    @GetMapping(value = "/个人中心")
    public String for5(){return "个人中心";}

    @GetMapping(value = "/修改密码")
    public String for6(){return "修改密码";}


    @RequestMapping("/register")
    public String register(UserInfo userInfo) {
         userInfoService.register(userInfo);
        return "redirect:/login";
    }

    @RequestMapping("userDel")
    public Integer UserDel(UserInfo userInfo) {
        return this.userInfoService.UserDel(userInfo);
    }

    @RequestMapping("userUpd")
    public Integer UserUpd(UserInfo userInfo) {
        return this.userInfoService.UserUpd(userInfo);
    }
}