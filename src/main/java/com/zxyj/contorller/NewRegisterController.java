package com.zxyj.contorller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.zxyj.service.NewRegisterService;

@Controller 

@RequestMapping(value="/newRegister")   
public class NewRegisterController {
    
	@Autowired
    NewRegisterService newRegisterService ;  
	
	

 /*  public ModelAndView  findNewRegNum(){
		ModelAndView mv=new ModelAndView();
		List li=newRegisterService.findNewRegNum();
		 Map ma = new HashMap(); 
		
		 mv.addObject("li",li);
	     //mv.setViewName("userReport");
		 mv.setViewName("bootstrapTest");
		return mv;  
   
    }*/
	@RequestMapping(value="num")
	@ResponseBody
	  public Map  findNewRegNum(Integer currentPage,Integer pNumbers){
		System.out.println(currentPage+"currentPage");
		int pageCount = 1 ;  //页数
		int cur_Page =  currentPage; // 当前页
		int pageSize =pNumbers; //每页条数
		
		//计算一共有多少页数
		List<?>  userReg=newRegisterService.findNewRegRowCount();
		   try {
			   pageCount=userReg.size();//总条数
			  /* System.out.println(pageCount+"pageCount");
			   System.out.println(pageSize+"pageSize");*/
              //通过计算，得到分页应该需要分几页，其中不满一页的数据按一页计算
              if(pageCount%pageSize!=0)
              {
            	  pageCount = pageCount / pageSize + 1;
              }
              else
              {
            	  pageCount = pageCount / pageSize;
              }
          } catch (Exception e) {
          
          }

		System.out.println(pageCount+"pageCount2");
			 List li=newRegisterService.findNewRegNum(currentPage, pNumbers);
			 Map ma = new HashMap(); 
			 ma.put("li",li);
			 ma.put("pageCount", pageCount);
			 ma.put("currentPage",currentPage);
			 return ma;  
	   
	    }
}

