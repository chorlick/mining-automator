/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.regis.miningautomator.models;

import java.util.Set;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author chorl_000
 */
@Entity
@Table(name="mining_installations")
public class MiningInstallation {

    private UUID id;    
    private UUID userId;
    private String name;
    private String description;
    //private Set<MiningRig> rigs;
    
    @Id
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
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    //public Set<MiningRig> getRigs() {
   //     return rigs;
    //}
    
    //public void setRigs(Set<MiningRig> rigs) {
   //     this.rigs = rigs;
    //}
 
}
