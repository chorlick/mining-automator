/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.controllers;

import edu.regis.miningautomator.models.PendingRegistration;
import edu.regis.miningautomator.models.User;
import edu.regis.miningautomator.services.PendingRegistrationService;
import edu.regis.miningautomator.services.UserService;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author chorl_000
 */
@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    @Autowired
    PendingRegistrationService pendingRegistrationService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @PostMapping(value = "/register")
    public String register(@ModelAttribute User user) {

        user.setId(UUID.randomUUID());
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        PendingRegistration registration = new PendingRegistration();
        registration.setId(UUID.randomUUID());
        registration.setUserId(user.getId());

        userService.save(user);
        pendingRegistrationService.save(registration);

        logger.info(user.toString());
        logger.info(registration.toString());

        logger.info("Pending Registration Created at http://localhost:8080/register/" + registration.getId().toString());

        return "register-success";
    }

    @GetMapping("/register/{uuid}")
    public String registerActivate(@PathVariable String uuid) {
        UUID id = UUID.fromString(uuid);
        PendingRegistration registration = pendingRegistrationService.findById(id);

        User user = userService.findById(registration.getUserId());
        user.setEnabled(true);

        userService.save(user);
        pendingRegistrationService.delete(registration);

        logger.info("Registartion completed for username " + user.getUsername());
        return "redirect:/login";
    }

}
