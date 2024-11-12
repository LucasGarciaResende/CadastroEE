/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AssemblyTypes;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AssemblyTypesFacadeLocal {

    void create(AssemblyTypes assemblyTypes);

    void edit(AssemblyTypes assemblyTypes);

    void remove(AssemblyTypes assemblyTypes);

    AssemblyTypes find(Object id);

    List<AssemblyTypes> findAll();

    List<AssemblyTypes> findRange(int[] range);

    int count();
    
}
