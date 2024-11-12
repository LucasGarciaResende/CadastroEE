/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AvailabilityGroups;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AvailabilityGroupsFacadeLocal {

    void create(AvailabilityGroups availabilityGroups);

    void edit(AvailabilityGroups availabilityGroups);

    void remove(AvailabilityGroups availabilityGroups);

    AvailabilityGroups find(Object id);

    List<AvailabilityGroups> findAll();

    List<AvailabilityGroups> findRange(int[] range);

    int count();
    
}
