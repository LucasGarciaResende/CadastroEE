/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnTypeUsages;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnTypeUsagesFacadeLocal {

    void create(ColumnTypeUsages columnTypeUsages);

    void edit(ColumnTypeUsages columnTypeUsages);

    void remove(ColumnTypeUsages columnTypeUsages);

    ColumnTypeUsages find(Object id);

    List<ColumnTypeUsages> findAll();

    List<ColumnTypeUsages> findRange(int[] range);

    int count();
    
}
