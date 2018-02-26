/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import edu.regis.miningautomator.models.User;
import java.util.UUID;

/**
 *
 * @author chorl_000
 */
public interface IUserService {
    public User findById(UUID uuid);
    public User save(User user);
    public User findByUsername(String username);
    public void delete(User user);
}
