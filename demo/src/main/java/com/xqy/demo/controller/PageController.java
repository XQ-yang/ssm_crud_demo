package com.xqy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 小强
 */
@Controller
public class PageController {

    /** 跳转至首页 */
    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }
    
    /** 跳转至用户页面 */
    @RequestMapping("/user")
    public String toUser() {
        return "user";
    }
}
