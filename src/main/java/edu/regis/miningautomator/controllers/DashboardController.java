/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.controllers;

import edu.regis.miningautomator.models.User;
import edu.regis.miningautomator.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author chorl_000
 */
@Controller
public class DashboardController {
    
    @Autowired
    UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/dashboard")
    public String dashboard( Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByUsername(auth.getName());
        model.addAttribute("user", user);
        logger.info(user.toString());
        return "dashboard";
    }
    
}
