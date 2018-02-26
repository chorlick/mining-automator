/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.services;

import edu.regis.miningautomator.models.User;
import edu.regis.miningautomator.repository.UserRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import interfaces.IUserService;

/**
 *
 * @author chorl_000
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository repository;
    
    @Override
    public User findById(UUID uuid) {
        return repository.findById(uuid);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }
    
    
}
