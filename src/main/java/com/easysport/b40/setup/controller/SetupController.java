package com.easysport.b40.setup.controller;/**
 * Created by sgkim on 2016-02-01.
 */

import com.easysport.b40.setup.service.SetupService;
import com.easysport.b40.setup.vo.SetupVo;
import com.easysport.common.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Controller
@SessionAttributes("setupVo")
public class SetupController {

    @Autowired
    SetupService setupService;

    @Autowired
    CommonUtil commonUtil;

    @RequestMapping("admin/setup/setupView.do")
    public String setupView(Model model) throws Exception {
        SetupVo setupVo = setupService.selectCompanyInfo(commonUtil.getMemberVo());
        model.addAttribute("setupVo",setupVo);
        return "/setup/setup";
    }

    @RequestMapping("/admin/setup/updateSetup.do")
    public String updateSetup(@Valid @ModelAttribute SetupVo setupVo
        ,BindingResult bindingResult, SessionStatus sessionStatus
    ) throws Exception{
        if(bindingResult.hasErrors()){
            return "/setup/setup";
        }else{
            setupService.updateCompany(setupVo);
            sessionStatus.setComplete();
            return "redirect:/user/main/mainPage.do";
        }
    }
}
