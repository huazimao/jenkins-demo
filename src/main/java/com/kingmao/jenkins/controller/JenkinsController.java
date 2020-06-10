package com.kingmao.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QX
 * @date 2020/5/19
 */
@RestController
public class JenkinsController {

    @GetMapping("/jenkins")
    public String hello(){
        return "欢迎来到8848！";
    }
}
