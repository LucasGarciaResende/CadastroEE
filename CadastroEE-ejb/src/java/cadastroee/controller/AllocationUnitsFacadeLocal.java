/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AllocationUnits;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AllocationUnitsFacadeLocal {

    void create(AllocationUnits allocationUnits);

    void edit(AllocationUnits allocationUnits);

    void remove(AllocationUnits allocationUnits);

    AllocationUnits find(Object id);

    List<AllocationUnits> findAll();

    List<AllocationUnits> findRange(int[] range);

    int count();
    
}
