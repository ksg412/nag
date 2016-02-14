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

    public List<String> tempGcmRegIdList(){
        List<String> gcmRegIdList = new ArrayList<String>();
        gcmRegIdList.add("APA91bE2wpG3jRvvFWqTbpMjTANTL4-z7Vw2uzD6cn2Qet8DMVecjemWH9ObvNI551GH72nvrt_WtiwEl81t7KChkElCXVUa79z_WWftrYPMVI-te3lrCpmGe3YaFbs1qL8h4RidtRlL-kabWzjoJsxV2SNLB1JXEQ");
//        gcmRegIdList.add("APA91bE5JXK24-n867cv8XqAlZPfIrzF8U5hsFj-Qkw1pUMeSdbrmfu52mLRsCJHZ5wJ7x582zWnrTU6af_mEHN35ETW0uYIAD_xpfPhHP7UyT9OJdrrwWeIVQ0GcuOUw1h4rNWJaCsD");
        return gcmRegIdList;
    }
}
