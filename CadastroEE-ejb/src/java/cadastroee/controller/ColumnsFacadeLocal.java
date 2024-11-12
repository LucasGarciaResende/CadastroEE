/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Columns;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnsFacadeLocal {

    void create(Columns columns);

    void edit(Columns columns);

    void remove(Columns columns);

    Columns find(Object id);

    List<Columns> findAll();

    List<Columns> findRange(int[] range);

    int count();
    
}
