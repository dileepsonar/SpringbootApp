package com.qac.springapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginpage() {
		return "login";
		
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String welcomepage(ModelMap Model ,@RequestParam String userId,@RequestParam String password) {
		
		if(userId.equals("dd5782032mail.com")&&password.equals("root")) {
			return "welcome";
		}
		Model.put("errorMsg","plese prive correct user id and password" );
		return "login";
}}