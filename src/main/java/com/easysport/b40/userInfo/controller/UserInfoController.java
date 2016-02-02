package com.easysport.b40.userInfo.controller;

import com.easysport.b40.userInfo.service.UserInfoService;
import com.easysport.b40.userInfo.vo.UserInfoVo;
import com.easysport.b40.validator.PasswordCheckValidator;
import com.easysport.common.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;


@Controller
@SessionAttributes("userInfoVo")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private PasswordCheckValidator passwordCheckValidator;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private CommonUtil commonUtil;

//	@InitBinder
//	public void initBinder(WebDataBinder dataBinder) {
//		dataBinder.setValidator(new PasswordCheckValidator());
//
//	}

//	sessionAttributes를 사용할 경우 아래 코드는 초기에 sessionAttribute 객체가 없다면
//	자동으로 sessionAttribute를 추가해주는 코드이다.
//	@ModelAttribute("userInfoVo")
//	public UserInfoVo userInfoVo() {
//		return new UserInfoVo();
//	}

	@RequestMapping("/guest/userInfo/userRegistView.do")
	private String userRegistView( Model model) throws Exception{
		model.addAttribute("userInfoVo",new UserInfoVo());
		return "userInfo/regist/userRegist";
	}

	@RequestMapping(value = "/guest/userInfo/insertUserRegistInfo.do" , method = RequestMethod.POST)
	private String insertUserRegistInfo(
			@Valid @ModelAttribute UserInfoVo userInfoVo
			,BindingResult bindingResult
			,SessionStatus sessionStatus
	) throws Exception{
		String url = "userInfo/regist/userRegist";

		if(!bindingResult.hasErrors()){
			passwordCheckValidator.validate(userInfoVo,bindingResult);
			if(!bindingResult.hasErrors()){
				userInfoService.insertUserRegistInfo(userInfoVo);
				sessionStatus.setComplete();
				url ="login/login";
			}
		}
		return url;
	}

	@RequestMapping("member/userInfo/userUpdateView.do")
	public String userUpdateView(Model model) throws Exception{
		UserInfoVo userInfoVo = userInfoService.selectUserInfo(commonUtil.getMemberVo().getEmail());
		model.addAttribute("userInfoVo",userInfoVo);
		return "/userInfo/update/userUpdate";
	}

	@RequestMapping("/member/userInfo/updateUserInfo.do")
	public String updateUserInfo(@Valid @ModelAttribute UserInfoVo userInfoVo
		,BindingResult bindingResult, SessionStatus sessionStatus) throws Exception{

		if(!bindingResult.hasErrors()){
			passwordCheckValidator.validate(userInfoVo,bindingResult);
			if(!bindingResult.hasErrors()){
				int aaa = userInfoService.updateUserInfo(userInfoVo);
				sessionStatus.setComplete();
				return "redirect:/user/main/mainPage.do";
			}
		}
		return "/userInfo/update/userUpdate";
	}
}