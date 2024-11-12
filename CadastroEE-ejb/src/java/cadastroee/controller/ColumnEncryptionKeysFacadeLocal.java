/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnEncryptionKeys;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnEncryptionKeysFacadeLocal {

    void create(ColumnEncryptionKeys columnEncryptionKeys);

    void edit(ColumnEncryptionKeys columnEncryptionKeys);

    void remove(ColumnEncryptionKeys columnEncryptionKeys);

    ColumnEncryptionKeys find(Object id);

    List<ColumnEncryptionKeys> findAll();

    List<ColumnEncryptionKeys> findRange(int[] range);

    int count();
    
}
