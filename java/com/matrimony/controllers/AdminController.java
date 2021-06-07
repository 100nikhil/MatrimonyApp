package com.matrimony.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matrimony.models.AdminDetails;
import com.matrimony.services.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	/*private static final String MY_SESSION_NOTES_CONSTANT = "MY_SESSION_NOTES";
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/")
	public String adminLogin(Model model, HttpSession session) {
		model.addAttribute("adminDetails",new AdminDetails());
		return "admin-login";
	}
	
	@PostMapping("/login")
	public String login(AdminDetails adminDetail, HttpServletRequest request) {
		System.out.println(adminDetail.getId()+" "+adminDetail.getPassword());
		request.getSession().setAttribute("name","abcd");
		if(adminService.login(adminDetail)) {
			return "help";
		}else {
			return "tips";
		}
		
	}
	
	@GetMapping("/login/a")
	public String match(HttpServletRequest request) {
		try {
			request.getSession().getAttribute("name").equals(null);
			return "faq";
		}catch(Exception e) {
			return "index";
		}
		//return "faq";
	}
	
	 @PostMapping(value = "/destroy")
	    public String destroySession(HttpServletRequest request) {
		 System.out.println(request.getSession().getAttribute("name"));
	        request.getSession().invalidate();
System.out.println(request.getSession().getAttribute("name"));
	        return "index";
	    }*/
	
}
