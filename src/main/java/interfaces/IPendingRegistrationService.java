/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import edu.regis.miningautomator.models.PendingRegistration;
import edu.regis.miningautomator.models.User;
import java.util.UUID;

/**
 *
 * @author chorl_000
 */
public interface IPendingRegistrationService {

    public PendingRegistration findById(UUID uuid);
    public PendingRegistration save(PendingRegistration registration);
    public void delete(PendingRegistration registration);
}
