/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.repository;

import edu.regis.miningautomator.models.PendingRegistration;
import edu.regis.miningautomator.models.User;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chorl_000
 */
@Repository
public interface PendingRegistrationRepository extends CrudRepository<PendingRegistration, UUID> {

    PendingRegistration findById(UUID id);

    PendingRegistration save(PendingRegistration registration);
    
    void delete(PendingRegistration registration);
}
