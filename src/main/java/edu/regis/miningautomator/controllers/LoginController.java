/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.controllers;

import edu.regis.miningautomator.models.User;
import edu.regis.miningautomator.services.UserService;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author chorl_000
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login(Model model) {
        logger.info("Creating bound bean");
        model.addAttribute("login", new User());
        model.addAttribute("user", new User());
        return "login";
    }
    
    @PostMapping( value = "/login")
    public String login(@ModelAttribute User user) {
        logger.info("Posted to login form");
        logger.info(user.toString());
        return "redirect:/dashboard";
    }
}
