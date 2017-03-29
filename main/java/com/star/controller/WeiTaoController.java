package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hp on 2017/3/26.
 */
@Controller
public class WeiTaoController {
    @RequestMapping(value = "/weitao")
    public String index(Model model){
        return "weitao";
    }
}
