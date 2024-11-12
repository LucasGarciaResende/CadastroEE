/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AvailabilityGroupListenerIpAddresses;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AvailabilityGroupListenerIpAddressesFacadeLocal {

    void create(AvailabilityGroupListenerIpAddresses availabilityGroupListenerIpAddresses);

    void edit(AvailabilityGroupListenerIpAddresses availabilityGroupListenerIpAddresses);

    void remove(AvailabilityGroupListenerIpAddresses availabilityGroupListenerIpAddresses);

    AvailabilityGroupListenerIpAddresses find(Object id);

    List<AvailabilityGroupListenerIpAddresses> findAll();

    List<AvailabilityGroupListenerIpAddresses> findRange(int[] range);

    int count();
    
}
