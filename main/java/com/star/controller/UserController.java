package com.star.controller;

import com.star.domain.User;
import com.star.repository.UserRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by hp on 2017/3/10.
 */

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login_page(Model model){
        model.addAttribute("user",new User());
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String email, String password, Model model){
        User user1=userRepository.findByEmailAndPassword(email,password);
        if (user1 == null){
            return "redirect:/login";
        }
        model.addAttribute("user",user1);
        return "personal";
    }


    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String addForm(Model model){
        model.addAttribute("user",new User());
        model.addAttribute("regist","true");
        return "login";
    }

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public String addUser(User user){
        //对于设置了AI的主键，不用设置id，Hibernate会自动设置
        userRepository.save(user);
        return "redirect:/index";
    }

   /* @RequestMapping(value = "/user_detail/{id}")
    public String user_detail(@PathVariable int id,Model model){
        model.addAttribute("user",userRepository.findOne(id));
        return "personal";
    }*/


}
