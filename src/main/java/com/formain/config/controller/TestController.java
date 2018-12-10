package com.formain.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：config
 * 包： com.formain.config.controller
 * 类名称：TestController.java
 * 类描述：测试
 * 创建人：wufuming
 * 创建时间：2018年11月24日
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello config";
    }
}