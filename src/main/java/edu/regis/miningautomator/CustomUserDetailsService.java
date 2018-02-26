/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator;

import edu.regis.miningautomator.models.User;
import edu.regis.miningautomator.services.UserService;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author chorl_000
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserService service;
    
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        User myUser = service.findByUsername(string);
        Collection<SimpleGrantedAuthority> auths = new ArrayList<SimpleGrantedAuthority>();
        auths.add(new SimpleGrantedAuthority("USER"));
        org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User(myUser.getUsername(),
                                                                                                                    myUser.getPassword(),
                                                                                                                    myUser.getEnabled(),
                                                                                                                    myUser.getEnabled(),
                                                                                                                    myUser.getEnabled(),
                                                                                                                    myUser.getEnabled(),
                                                                                                                    auths);
        
        return user;
    }
    
}
