/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ComputedColumns;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ComputedColumnsFacadeLocal {

    void create(ComputedColumns computedColumns);

    void edit(ComputedColumns computedColumns);

    void remove(ComputedColumns computedColumns);

    ComputedColumns find(Object id);

    List<ComputedColumns> findAll();

    List<ComputedColumns> findRange(int[] range);

    int count();
    
}
