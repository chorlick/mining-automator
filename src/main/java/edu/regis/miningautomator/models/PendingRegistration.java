/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.models;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author chorl_000
 */
@Entity
public class PendingRegistration {
    
    @Id
    private UUID id;
    private UUID userId;
    
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PendingRegistration{" + "id=" + id + ", userId=" + userId + '}';
    }

    
    
}
