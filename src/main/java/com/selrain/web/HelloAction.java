package com.selrain.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.selrain.model.Distributor;

@Controller
public class HelloAction {
  
	@RequestMapping("/hello.xhtml")
	public String hello(){
		return "hello/hello.vm";
	}
	
	@RequestMapping("/bootstrap/table.xhtml")
	public String boot_table(){
		List<Distributor> list=new ArrayList<Distributor>();
		for(int i=0;i<100;i++){
			Distributor d=new Distributor("ºÏ×÷ÉÌ"+i, i+"", (long)i+i);
			list.add(d);
		}
		return "";
	}
	
}
