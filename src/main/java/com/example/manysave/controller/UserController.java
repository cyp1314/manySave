package com.example.manysave.controller;


import com.example.manysave.anno.CurrentUser;
import com.example.manysave.entity.User;
import com.example.manysave.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cyp
 * @since 2022-02-24
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/register")
    public Map register(User user){
        Map result =  userService.register(user);
        return result;
    }

    @GetMapping("/testp")
    public String testPar(String a,@CurrentUser User user,String b){
      log.info(user.toString());
      log.info(a);
      log.info(b);
      return "success";
    }
}
