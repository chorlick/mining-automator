/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.services;

import edu.regis.miningautomator.models.PendingRegistration;
import edu.regis.miningautomator.repository.PendingRegistrationRepository;
import interfaces.IPendingRegistrationService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chorl_000
 */
@Service
public class PendingRegistrationService implements IPendingRegistrationService {

    @Autowired
    private PendingRegistrationRepository repository;
    
    @Override
    public PendingRegistration findById(UUID uuid) {
        return repository.findById(uuid);
    }

    @Override
    public PendingRegistration save(PendingRegistration registration) {
        return repository.save(registration);
    }

    @Override
    public void delete(PendingRegistration registration) {
        repository.delete(registration);
    }
    
}
