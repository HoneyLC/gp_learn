package com.edu.spring.mvc.test;

import com.edu.spring.mvc.annotation.GPAutowired;
import com.edu.spring.mvc.annotation.GPController;
import com.edu.spring.mvc.annotation.GPRequestMapping;
import com.edu.spring.mvc.annotation.GPRequestParam;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@GPController
@GPRequestMapping("/demo")
public class DemoAction {

  //	@GPAutowired
//	private IDemoService demoService;

	//第一版请求
	@GPRequestMapping("/query")
	public void query(HttpServletRequest req, HttpServletResponse resp,
					  @GPRequestParam("name") String name){
//		String result = demoService.get(name);
		String result = "My name is " + name;
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GPRequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@GPRequestParam("a") Integer a, @GPRequestParam("b") Integer b){
		try {
			resp.getWriter().write(a + "+" + b + "=" + (a + b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GPRequestMapping("/sub")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@GPRequestParam("a") Double a, @GPRequestParam("b") Double b){
		try {
			resp.getWriter().write(a + "-" + b + "=" + (a - b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GPRequestMapping("/remove")
	public String  remove(@GPRequestParam("id") Integer id){
		return "" + id;
	}

}
