/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnMasterKeys;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnMasterKeysFacadeLocal {

    void create(ColumnMasterKeys columnMasterKeys);

    void edit(ColumnMasterKeys columnMasterKeys);

    void remove(ColumnMasterKeys columnMasterKeys);

    ColumnMasterKeys find(Object id);

    List<ColumnMasterKeys> findAll();

    List<ColumnMasterKeys> findRange(int[] range);

    int count();
    
}
