package com.easysport.b40.messagePush.controller;/**
 * @Author : sgkim
 * @Date : 2016-02-12
 * @Version : 1.0
 */

import com.easysport.b40.messagePush.service.MessagePushService;
import com.easysport.b40.messagePush.vo.MessagePushVo;
import com.easysport.b40.setup.vo.SetupVo;
import com.easysport.common.util.SpringPushMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MessagePushController {

    @Autowired
    SpringPushMessage springPushMessage;

    @Autowired
    MessagePushService messagePushService;

    @RequestMapping("/admin/messagePush/messagePushView.do")
    public String setupView(Model model) throws Exception {
        SetupVo setupVo = new SetupVo();
        model.addAttribute("messagePushVo",new MessagePushVo());
        return "/messagePush/messagePush";
    }

    @RequestMapping("/admin/messagePush/messagePushAction.do")
    public String messagePushView(@Valid @ModelAttribute MessagePushVo messagePushVo
            , BindingResult bindingResult, SessionStatus sessionStatus, Model model
    ) throws Exception {

        List<String> gcmRegIdList = this.tempGcmRegIdList();
        Map<String,Object> resultMap = springPushMessage.pushNotificationToGCM(gcmRegIdList, messagePushVo.getMsg());
        model.addAttribute("resultMap",resultMap);
        return "redirect:/admin/messagePush/messagePushView.do";
    }

    public List<String> tempGcmRegIdList() throws Exception{
        List<String> gcmRegIdList = messagePushService.getRegIdListPushY();
        return gcmRegIdList;
    }
}
