package com.zxyj.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zxyj.entity.User;
import com.zxyj.service.DustbinService;
import com.zxyj.service.LoginService;

@Controller 
@RequestMapping(value="/findAllDustbin")   
public class DustbinController {
    
	@Autowired
    DustbinService dustbinService;  

	@RequestMapping(method=RequestMethod.GET)
    public ModelAndView postq(){  
		ModelAndView mav = new ModelAndView(); 
       List na= dustbinService.finds();
       /*for(User s: na) {
    	   System.out.println(s.getUserName());
       }*/
       mav.addObject(na);
       mav.setViewName("login");
        return mav;
    }
}

