package com.lixuecheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//注解controller
@Controller
public class MyController {

	
	//请求的地址返回到list页面
	  @RequestMapping("list")
	  public   String   list() {
		  
		  //返回页面
		  return  "list";
		  
	  }
}
