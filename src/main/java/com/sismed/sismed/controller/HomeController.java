package com.sismed.sismed.controller;

import com.sismed.sismed.util.HeaderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    AuthenticationController authenticationController;
    @RequestMapping("/")
    public ModelAndView home () {

        return new ModelAndView("home/index").addObject("user",
                new HeaderDTO(authenticationController.getUsuarioLogado()));
    }
}
