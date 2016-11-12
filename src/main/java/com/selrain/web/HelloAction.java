package com.selrain.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selrain.model.Distributor;
import com.selrain.util.JsonUtils;

@Controller
public class HelloAction {
  
	@RequestMapping("/hello.xhtml")
	public String hello(){
		return "table/table_ajax.vm";
	}
	
	@RequestMapping("/bootstrap/table.xhtml")
	public String boot_table(ModelMap model,HttpServletResponse response) throws IOException{
		List<Distributor> list=new ArrayList<Distributor>();
		for(int i=0;i<100;i++){
			Distributor d=new Distributor("ºÏ×÷ÉÌ"+i, i+"", (long)i+i);
			list.add(d);
		}
		//response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		model.put("directOut", JsonUtils.writeObject(list, null, response.getWriter(), false));
		return "common/directOut.vm";
	}
	
}
