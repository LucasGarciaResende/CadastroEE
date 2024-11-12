/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AvailabilityReadOnlyRoutingLists;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AvailabilityReadOnlyRoutingListsFacadeLocal {

    void create(AvailabilityReadOnlyRoutingLists availabilityReadOnlyRoutingLists);

    void edit(AvailabilityReadOnlyRoutingLists availabilityReadOnlyRoutingLists);

    void remove(AvailabilityReadOnlyRoutingLists availabilityReadOnlyRoutingLists);

    AvailabilityReadOnlyRoutingLists find(Object id);

    List<AvailabilityReadOnlyRoutingLists> findAll();

    List<AvailabilityReadOnlyRoutingLists> findRange(int[] range);

    int count();
    
}
