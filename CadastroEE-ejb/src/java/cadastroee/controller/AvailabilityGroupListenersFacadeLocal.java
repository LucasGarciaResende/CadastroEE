/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AvailabilityGroupListeners;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AvailabilityGroupListenersFacadeLocal {

    void create(AvailabilityGroupListeners availabilityGroupListeners);

    void edit(AvailabilityGroupListeners availabilityGroupListeners);

    void remove(AvailabilityGroupListeners availabilityGroupListeners);

    AvailabilityGroupListeners find(Object id);

    List<AvailabilityGroupListeners> findAll();

    List<AvailabilityGroupListeners> findRange(int[] range);

    int count();
    
}
