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

/**
 *
 * @author chorl_000
 */

public class MiningRig {

    private UUID id;
    private String name;
    private String description;
    private MiningInstallation installation;

    @Id
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public MiningInstallation getMinigInstallation() {
        return installation;
    }

    public void setMiningInstallation(MiningInstallation insallation) {
        this.installation = insallation;
    }

}
