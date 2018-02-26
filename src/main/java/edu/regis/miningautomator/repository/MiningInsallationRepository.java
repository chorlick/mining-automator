/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.repository;

import edu.regis.miningautomator.models.MiningInstallation;
import edu.regis.miningautomator.models.User;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chorl_000
 */
@Repository
public interface MiningInsallationRepository extends CrudRepository<MiningInstallation, UUID> {
    MiningInstallation findById(UUID id);
    MiningInstallation save(MiningInstallation installation);
    Iterable<MiningInstallation> findAllByUserId(UUID id);
    void delete(MiningInstallation installation);
}
