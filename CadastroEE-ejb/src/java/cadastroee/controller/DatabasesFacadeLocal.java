/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Databases;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabasesFacadeLocal {

    void create(Databases databases);

    void edit(Databases databases);

    void remove(Databases databases);

    Databases find(Object id);

    List<Databases> findAll();

    List<Databases> findRange(int[] range);

    int count();
    
}
