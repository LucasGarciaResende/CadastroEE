/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ConstraintColumnUsage;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ConstraintColumnUsageFacadeLocal {

    void create(ConstraintColumnUsage constraintColumnUsage);

    void edit(ConstraintColumnUsage constraintColumnUsage);

    void remove(ConstraintColumnUsage constraintColumnUsage);

    ConstraintColumnUsage find(Object id);

    List<ConstraintColumnUsage> findAll();

    List<ConstraintColumnUsage> findRange(int[] range);

    int count();
    
}
