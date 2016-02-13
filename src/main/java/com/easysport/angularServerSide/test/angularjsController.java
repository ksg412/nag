package com.easysport.angularServerSide.test;

import com.easysport.common.util.SpringPushMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sg on 2016-02-10.
 */
@RestController
public class angularjsController {

    @Autowired
    SpringPushMessage springPushMessage;

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

    @RequestMapping(value = "/angularjs/pushMessage")
    public void pushMessage() {
        List<String> gcmRegIdList = new ArrayList<String>();
        gcmRegIdList.add("APA91bE2wpG3jRvvFWqTbpMjTANTL4-z7Vw2uzD6cn2Qet8DMVecjemWH9ObvNI551GH72nvrt_WtiwEl81t7KChkElCXVUa79z_WWftrYPMVI-te3lrCpmGe3YaFbs1qL8h4RidtRlL-kabWzjoJsxV2SNLB1JXEQ");
        gcmRegIdList.add("APA91bE5JXK24-n867cv8XqAlZPfIrzF8U5hsFj-Qkw1pUMeSdbrmfu52mLRsCJHZ5wJ7x582zWnrTU6af_mEHN35ETW0uYIAD_xpfPhHP7UyT9OJdrrwWeIVQ0GcuOUw1h4rNWJaCsD");
        springPushMessage.pushNotificationToGCM(gcmRegIdList, "안녕하세요");
    }


}
