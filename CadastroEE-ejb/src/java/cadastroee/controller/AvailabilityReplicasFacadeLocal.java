/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AvailabilityReplicas;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AvailabilityReplicasFacadeLocal {

    void create(AvailabilityReplicas availabilityReplicas);

    void edit(AvailabilityReplicas availabilityReplicas);

    void remove(AvailabilityReplicas availabilityReplicas);

    AvailabilityReplicas find(Object id);

    List<AvailabilityReplicas> findAll();

    List<AvailabilityReplicas> findRange(int[] range);

    int count();
    
}
