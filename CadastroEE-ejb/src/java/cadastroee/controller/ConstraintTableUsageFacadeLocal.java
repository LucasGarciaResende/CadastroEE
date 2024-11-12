/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ConstraintTableUsage;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ConstraintTableUsageFacadeLocal {

    void create(ConstraintTableUsage constraintTableUsage);

    void edit(ConstraintTableUsage constraintTableUsage);

    void remove(ConstraintTableUsage constraintTableUsage);

    ConstraintTableUsage find(Object id);

    List<ConstraintTableUsage> findAll();

    List<ConstraintTableUsage> findRange(int[] range);

    int count();
    
}
