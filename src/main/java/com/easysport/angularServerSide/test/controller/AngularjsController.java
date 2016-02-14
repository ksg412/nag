package com.easysport.angularServerSide.test.controller;

import com.easysport.angularServerSide.test.service.AngularjsService;
import com.easysport.common.util.SpringPushMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sg on 2016-02-10.
 */
@RestController
public class AngularjsController {

    @Autowired
    SpringPushMessage springPushMessage;

    @Autowired
    AngularjsService angularjsService;

    @RequestMapping(value = "/angularjs/user")
    public ResponseEntity<List<Map<String,String>>> listAllUsers() {

        List<Map<String,String>> user = new ArrayList<Map<String, String>>();
        Map<String,String> userMap = new HashMap<String, String>();
        userMap.put("name","김상구");
        userMap.put("avatar","svg-1");
        userMap.put("content","김상구 데이터 불러오기 성공");
        user.add(userMap);

        Map<String,String> userMap2 = new HashMap<String, String>();
        userMap2.put("name","홍길동");
        userMap2.put("avatar","svg-2");
        userMap2.put("content","홍길동 데이터 불러오기 성공");
        user.add(userMap2);

        if(user.isEmpty()){
            return new ResponseEntity<List<Map<String,String>>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Map<String,String>>>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/angularjs/pushMessage/regist")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void pushMessageRegist(@RequestParam("device_token") String regId) throws Exception {
        System.out.println("등록:"+regId);
        angularjsService.insertRegId(regId);
    }

    @RequestMapping(value = "/angularjs/pushMessage/cancel")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void pushMessageCancel(@RequestParam("device_token") String regId) throws Exception {
        System.out.println("취소:"+regId);
        angularjsService.updateRegIdCancel(regId);
    }

}
