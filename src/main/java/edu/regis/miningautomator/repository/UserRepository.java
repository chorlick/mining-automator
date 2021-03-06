/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.repository;

import edu.regis.miningautomator.models.User;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chorl_000
 */
@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

    User findById(UUID id);
    User save(User user);
    User findByUsername(String username);
    void delete(User user);
}
