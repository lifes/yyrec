package com.github.chm.yyrec.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class IndexController {

	@RequestMapping("/hello")
	public String index() {
		return "index";
	}

	@RequestMapping("/suggestion")
	@ResponseBody
	public List<Map<String, Object>> suggestion() {
		System.out.println("have received a request!!!");
		List<Map<String, Object>> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Map<String, Object> map = new HashMap<>();
			map.put("value", "浙AZD19"+i);
			list.add(map);
		}

		return list;
	}
	
	@RequestMapping("/getWithJson")
	@ResponseBody
	public String getWithJson(@RequestBody Map<String, Object> json, HttpServletRequest request) {
		System.out.println(request.getQueryString());
		System.out.println(json);
		return "index";
	}
}
