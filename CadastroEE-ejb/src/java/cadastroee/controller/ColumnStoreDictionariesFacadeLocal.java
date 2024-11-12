/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnStoreDictionaries;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnStoreDictionariesFacadeLocal {

    void create(ColumnStoreDictionaries columnStoreDictionaries);

    void edit(ColumnStoreDictionaries columnStoreDictionaries);

    void remove(ColumnStoreDictionaries columnStoreDictionaries);

    ColumnStoreDictionaries find(Object id);

    List<ColumnStoreDictionaries> findAll();

    List<ColumnStoreDictionaries> findRange(int[] range);

    int count();
    
}
