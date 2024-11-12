/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Assemblies;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AssembliesFacadeLocal {

    void create(Assemblies assemblies);

    void edit(Assemblies assemblies);

    void remove(Assemblies assemblies);

    Assemblies find(Object id);

    List<Assemblies> findAll();

    List<Assemblies> findRange(int[] range);

    int count();
    
}
