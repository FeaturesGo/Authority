package com.authority.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vincent on 2017/5/10.
 */
@Controller
@RequestMapping("/test")
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    private static final String SUCCESS = "success";

    @RequestMapping("/testFunction")
    public String testFunction(){
        logger.info("testFunction is OK!!!");
        return SUCCESS;
    }
}
