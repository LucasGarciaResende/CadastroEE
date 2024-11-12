/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AssemblyFiles;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AssemblyFilesFacadeLocal {

    void create(AssemblyFiles assemblyFiles);

    void edit(AssemblyFiles assemblyFiles);

    void remove(AssemblyFiles assemblyFiles);

    AssemblyFiles find(Object id);

    List<AssemblyFiles> findAll();

    List<AssemblyFiles> findRange(int[] range);

    int count();
    
}
