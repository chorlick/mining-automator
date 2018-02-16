    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author chorl_000
 */
@Controller
public class RegistrationController {
    
    @RequestMapping("/register")
    public String register() {
        return "register";
    }
    
}
