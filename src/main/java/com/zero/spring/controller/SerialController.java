package com.zero.spring.controller;

import com.zero.spring.service.SerialService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * Created by zqh on 2017/6/2.
 */
@Controller
@RequestMapping(value = "/serial")
public class SerialController {
    private static final Logger LOGGER = Logger.getLogger(SerialController.class);

    @Resource
    private SerialService serialService;

    @ModelAttribute
    public void initController(){

    }

}
