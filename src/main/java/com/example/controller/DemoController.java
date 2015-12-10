package com.example.controller;

import com.example.bean.User;
import com.example.property.Chao;
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zcfrank1st on 12/8/15.
 */
@RestController
public class DemoController {
    @Autowired
    private User user;

    @Autowired
    private Chao chao;

    @Autowired
    private DemoService demoService;

//    @Autowired
//    private HelloApi helloService;

    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    public Chao hello(){
        System.out.println(user.getAge());
        System.out.println(user.getUserName());
        System.out.println(chao.getAge());
        System.out.println(chao.getName());
        System.out.println(demoService.getIt());

//        System.out.println(helloService.hello());
        return chao;
    }
}
