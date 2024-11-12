/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AvailabilityDatabasesCluster;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AvailabilityDatabasesClusterFacadeLocal {

    void create(AvailabilityDatabasesCluster availabilityDatabasesCluster);

    void edit(AvailabilityDatabasesCluster availabilityDatabasesCluster);

    void remove(AvailabilityDatabasesCluster availabilityDatabasesCluster);

    AvailabilityDatabasesCluster find(Object id);

    List<AvailabilityDatabasesCluster> findAll();

    List<AvailabilityDatabasesCluster> findRange(int[] range);

    int count();
    
}
