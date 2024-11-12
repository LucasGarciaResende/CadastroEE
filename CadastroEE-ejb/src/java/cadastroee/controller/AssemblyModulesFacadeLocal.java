/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AssemblyModules;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AssemblyModulesFacadeLocal {

    void create(AssemblyModules assemblyModules);

    void edit(AssemblyModules assemblyModules);

    void remove(AssemblyModules assemblyModules);

    AssemblyModules find(Object id);

    List<AssemblyModules> findAll();

    List<AssemblyModules> findRange(int[] range);

    int count();
    
}
