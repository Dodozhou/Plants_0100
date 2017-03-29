package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hp on 2017/3/26.
 */
@Controller
public class DiaryController {
    @RequestMapping(value = "/diary")
    public String diary(){
        return "diary";
    }
}
