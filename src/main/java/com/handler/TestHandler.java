package com.handler;


import com.entity.TestU;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestHandler {
private TestService testService;
    @RequestMapping("test")
    public String testConn() {
        return "hello word";
    }


    /**
     * 对应的是get请求，405
     *
     * @param id
     * @return
     */
    @GetMapping("test1")
    public String test2(Integer id) {
        System.out.println("id:------>" + id);
        return "success";
    }


    @GetMapping("userLogin")
    public Integer testUSerLogin(String name, String pwd) {
        int code = this.testService.userLogin(name, pwd);
        return code;
    }

    @GetMapping("regiter")
    public String reigster(String name, String pwd) {
        if (1 > 0) {
            return "redirect:/login";
        } else {
            //
            return "redirect:/register";
        }
    }


    /**
     * @return
     */
    @RequestMapping("testGetAllUser")
    public List<TestU> getAllUser() {
        return this.testService.getAllUser();
    }


    @RequestMapping("testUserRes")
    public Integer userRes(TestU testU) {
        System.out.println(testU);
        return this.testService.userRes(testU);
    }


    /**
     *
     */
    /*@RequestMapping("getProList")
    public List<Project> getProList() {
        return this.testService.getProList();
    }*/


}

