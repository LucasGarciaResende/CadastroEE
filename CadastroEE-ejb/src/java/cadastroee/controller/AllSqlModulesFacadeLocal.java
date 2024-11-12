/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AllSqlModules;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AllSqlModulesFacadeLocal {

    void create(AllSqlModules allSqlModules);

    void edit(AllSqlModules allSqlModules);

    void remove(AllSqlModules allSqlModules);

    AllSqlModules find(Object id);

    List<AllSqlModules> findAll();

    List<AllSqlModules> findRange(int[] range);

    int count();
    
}
