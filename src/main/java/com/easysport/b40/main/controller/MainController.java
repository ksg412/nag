package com.easysport.b40.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easysport.b40.main.service.MainService;
import com.easysport.b40.main.vo.MainVo;
import com.easysport.b40.member.vo.MemberVo;
import com.easysport.common.util.CommonUtil;

@Controller
public class MainController {

	@Autowired
	CommonUtil commonUtil;

	@Autowired
	MainService mainService;

	@ModelAttribute("memberVo")
	public MemberVo memberVo() {
		return commonUtil.getMemberVo();
	}

	@RequestMapping("/user/main/mainPage.do")
	private String mainPage() throws Exception{
		return "main/mainPage";
	}
	
	@RequestMapping("/conponent/headerPage.do")
	private String headerPage(Model model) throws Exception{
		MainVo mainVo = mainService.selectMainInfo(commonUtil.getMemberVo());
		model.addAttribute("mainVo",mainVo);
		return "main/headerPage";
	}
	
	@RequestMapping("/conponent/footerPage.do")
	private String footerPage() throws Exception{
		return "main/footerPage";
	}

	@RequestMapping("/conponent/carouselPage.do")
	private String carouselPage() throws Exception{
		return "main/carouselPage";
	}

	@RequestMapping("/conponent/jumbotronPage.do")
	private String jumbotronPage() throws Exception{
		return "main/jumbotronPage";
	}

	@RequestMapping("/conponent/featurettesPage.do")
	private String featurettesPage() throws Exception{
		return "main/featurettesPage";
	}

	@RequestMapping("/conponent/topHeaderPage.do")
	private String topHeaderPage() throws Exception{
		return "main/topHeaderPage";
	}

}
