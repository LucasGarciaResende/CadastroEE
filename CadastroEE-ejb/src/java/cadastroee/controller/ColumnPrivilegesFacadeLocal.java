/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnPrivileges;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnPrivilegesFacadeLocal {

    void create(ColumnPrivileges columnPrivileges);

    void edit(ColumnPrivileges columnPrivileges);

    void remove(ColumnPrivileges columnPrivileges);

    ColumnPrivileges find(Object id);

    List<ColumnPrivileges> findAll();

    List<ColumnPrivileges> findRange(int[] range);

    int count();
    
}
