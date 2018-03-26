package com.cpic.chinterface.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cpic.chinterface.model.CenterAccount;
import com.cpic.chinterface.service.IUserService;

@Controller  
@RequestMapping("/user")  
// /user/**
public class UserController {  
    private static Logger log = LoggerFactory.getLogger(UserController.class);
    @Resource  
    private IUserService userService;     
    
    // /user/test?id=1
//    @RequestMapping(value="/test",method=RequestMethod.GET)  
//    public String test(HttpServletRequest request){  
//    	String idCard = request.getParameter("idCard");  
//        System.out.println("idCard:"+idCard);
//        CenterAccount centerAccount = userService.getUserByIdcard(idCard);
//        return centerAccount.getAccount();
//    }  
    @ResponseBody
    @RequestMapping(value="/findById",method=RequestMethod.GET)  
    public String findById(HttpServletRequest request){  
    	String id = request.getParameter("id");  
        System.out.println("id:"+id);
        CenterAccount centerAccount = userService.findById(Long.valueOf(id));
        return centerAccount.getAccount();
    }  
 
    
}  
