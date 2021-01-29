package com.example.demo.controller.interceptor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.User;

@Controller
@RequestMapping("two")
public class TwoController {

	@RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "itzixi22");
        return "thymeleaf/index";
    }
	
	@RequestMapping("center")
    public String center() {
        return "thymeleaf/center/center";
    }

	@RequestMapping("test")
    public String test(ModelMap map) {
		
		User user = new User();

		user.setName("manager");
		user.setPassword("123456");

		
		map.addAttribute("user", user);
		
		
		User u1 = new User();

		u1.setName("itzixi");
		u1.setPassword("123456");

		
		User u2 = new User();

		u2.setName("LeeCX");
		u2.setPassword("123456");

		
		List<User> userList = new ArrayList<>();
		userList.add(user);
		userList.add(u1);
		userList.add(u2);
		
		map.addAttribute("userList", userList);
		
        return "thymeleaf/test";
    }
	
	@PostMapping("postform")
    public String postform(User user) {
		System.out.println(user.getName());
        return "redirect:/th/test";
    }
}