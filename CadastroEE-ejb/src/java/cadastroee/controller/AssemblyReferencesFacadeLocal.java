/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AssemblyReferences;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AssemblyReferencesFacadeLocal {

    void create(AssemblyReferences assemblyReferences);

    void edit(AssemblyReferences assemblyReferences);

    void remove(AssemblyReferences assemblyReferences);

    AssemblyReferences find(Object id);

    List<AssemblyReferences> findAll();

    List<AssemblyReferences> findRange(int[] range);

    int count();
    
}
