/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AvailabilityGroupsCluster;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AvailabilityGroupsClusterFacadeLocal {

    void create(AvailabilityGroupsCluster availabilityGroupsCluster);

    void edit(AvailabilityGroupsCluster availabilityGroupsCluster);

    void remove(AvailabilityGroupsCluster availabilityGroupsCluster);

    AvailabilityGroupsCluster find(Object id);

    List<AvailabilityGroupsCluster> findAll();

    List<AvailabilityGroupsCluster> findRange(int[] range);

    int count();
    
}
