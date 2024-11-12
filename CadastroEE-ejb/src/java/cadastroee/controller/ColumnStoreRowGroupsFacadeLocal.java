/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnStoreRowGroups;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnStoreRowGroupsFacadeLocal {

    void create(ColumnStoreRowGroups columnStoreRowGroups);

    void edit(ColumnStoreRowGroups columnStoreRowGroups);

    void remove(ColumnStoreRowGroups columnStoreRowGroups);

    ColumnStoreRowGroups find(Object id);

    List<ColumnStoreRowGroups> findAll();

    List<ColumnStoreRowGroups> findRange(int[] range);

    int count();
    
}
