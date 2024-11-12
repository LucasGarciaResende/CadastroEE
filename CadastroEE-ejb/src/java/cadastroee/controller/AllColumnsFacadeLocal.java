/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AllColumns;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AllColumnsFacadeLocal {

    void create(AllColumns allColumns);

    void edit(AllColumns allColumns);

    void remove(AllColumns allColumns);

    AllColumns find(Object id);

    List<AllColumns> findAll();

    List<AllColumns> findRange(int[] range);

    int count();
    
}
