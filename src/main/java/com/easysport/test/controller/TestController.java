package com.easysport.test.controller;/**
 * @Author : sgkim
 * @Date : 2016-02-01
 * @Version : 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easysport.test.service.TestService;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test/d3/testView01.do")
    public String testView01() throws Exception {

        return "/test/testView01";
    }

    @RequestMapping("/test/d3/testView02.do")
    public String testView02() throws Exception{
        return "/test/testView02";
    }

    @RequestMapping("/test/d3/testView03.do")
    public String testView03() throws Exception{
        return "/test/testView03";
    }

    @RequestMapping("/test/d3/testView04.do")
    public String testView04() throws Exception{
        return "/test/testView04";
    }

}
