/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnEncryptionKeyValues;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnEncryptionKeyValuesFacadeLocal {

    void create(ColumnEncryptionKeyValues columnEncryptionKeyValues);

    void edit(ColumnEncryptionKeyValues columnEncryptionKeyValues);

    void remove(ColumnEncryptionKeyValues columnEncryptionKeyValues);

    ColumnEncryptionKeyValues find(Object id);

    List<ColumnEncryptionKeyValues> findAll();

    List<ColumnEncryptionKeyValues> findRange(int[] range);

    int count();
    
}
