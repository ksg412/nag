package com.easysport.angularServerSide.test;

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
}
