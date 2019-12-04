package com.lixuecheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//注解controller
/*
 * 123
 */
@Controller
public class MyController {

	
	//请求的地址返回到list页面111
	  @RequestMapping("list")
	  public   String   list() {
		  
		  //返回页面
		  return  "list";
		  //A：增加了一条注释
		  
		  //A：我喜欢大海，我爱过你
		  
		  //A：闽清子
	  }
}
