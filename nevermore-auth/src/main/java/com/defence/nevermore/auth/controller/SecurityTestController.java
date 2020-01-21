package com.defence.nevermore.auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description: java类作用描述
 * @Author:
 */
@RestController
public class SecurityTestController {

    @RequestMapping("loginIndex")
    public ModelAndView loginIndex() {
        ModelAndView view = new ModelAndView("login");
        return view;
    }




    @PreAuthorize("hasRole('ROLE_admin')")
    @GetMapping("test1")
    public ModelAndView test1() {
        ModelAndView view = new ModelAndView("test1");
        return view;
    }
    @PreAuthorize("hasAnyRole('user','ROLE_admin')")
    @GetMapping("test2")
    public ModelAndView test2() {
        ModelAndView view = new ModelAndView("test2");
        return view;
    }

}
