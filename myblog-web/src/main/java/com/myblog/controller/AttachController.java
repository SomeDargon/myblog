package com.myblog.controller;

import com.myblog.service.AttachService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by somedragon on 2018/5/17.
 */
@RestController
@Api("ceshi")
@RequestMapping("/api/app")
public class AttachController {

    @Autowired
    private AttachService attachService;

    @GetMapping("/index")
    public String index(){
        return "hello world!";
    }
}
