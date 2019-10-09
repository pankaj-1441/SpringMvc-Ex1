package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private User user;
    @PostMapping("/show")
    public ModelAndView show(HttpServletRequest request){
        ModelAndView mv=new ModelAndView("display");
        mv.addObject("result",user.getName());
        return mv;
    }
}
