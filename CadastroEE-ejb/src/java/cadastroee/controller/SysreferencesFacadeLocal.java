/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Sysreferences;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface SysreferencesFacadeLocal {

    void create(Sysreferences sysreferences);

    void edit(Sysreferences sysreferences);

    void remove(Sysreferences sysreferences);

    Sysreferences find(Object id);

    List<Sysreferences> findAll();

    List<Sysreferences> findRange(int[] range);

    int count();
    
}
