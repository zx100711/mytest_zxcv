package com.zxyj.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zxyj.entity.User;
import com.zxyj.service.LoginService;

@Controller 
@RequestMapping(value="/login")   
public class LoginController {

    @Autowired
    LoginService loginService; 

   /* @RequestMapping(method=RequestMethod.GET)
    public String get(){ 
        return "login"; 
    }
*/
    @RequestMapping(method=RequestMethod.GET)
    public String get(){ 
        return "bootstrap"; 
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String post(User user){  
        if (loginService.login(user.getUserName(), user.getPassword())==1) {
            return "login_success";  
        }
        return "login";
    }
}

