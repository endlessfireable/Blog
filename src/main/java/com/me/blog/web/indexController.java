package com.me.blog.web;

import com.me.blog.notfind.notFoundException;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(){

        return "index";
    }
}
