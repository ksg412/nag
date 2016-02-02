package com.easysport.b40.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class loginController {

	@RequestMapping("/guest/main/loginCheck.do")
	private String loginCheck(
			@RequestParam Map<String,Object> paramMap
			,ModelMap model
			,RedirectAttributes redirectAttr) throws Exception{
		boolean loginCheck = false;

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Object principal = authentication.getPrincipal();
		String name = authentication.getName();
		if(principal != null && principal instanceof UserDetails){
			return "redirect:/user/main/mainPage.do";
		}else{
			return "redirect:/guest/main/login.do";
		}
	}
	
	@RequestMapping("/guest/main/login.do")
	public String login(@RequestParam Map<String,Object> paramMap, ModelMap model, HttpServletRequest request) throws Exception{
		String openType = (String) request.getAttribute("openType");
		model.addAttribute("openType",openType);
		return "login/login";
	}
	
	@RequestMapping("/guest/main/loginFail.do")
	public void loginFail(@RequestParam Map<String,Object> paramMap
			, ModelMap model
			,HttpServletRequest request
			,HttpServletResponse response
			) throws Exception{
		RequestDispatcher rd = request.getRequestDispatcher("/guest/main/login.do");
		request.setAttribute("openType", "F");
		rd.forward(request, response);
	}
	
	@RequestMapping("/guest/main/logout.do")
	public String logout(@RequestParam Map<String,Object> paramMap, ModelMap model) throws Exception{
		return "login/logout";
	}
}
