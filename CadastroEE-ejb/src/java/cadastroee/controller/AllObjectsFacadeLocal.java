/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AllObjects;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AllObjectsFacadeLocal {

    void create(AllObjects allObjects);

    void edit(AllObjects allObjects);

    void remove(AllObjects allObjects);

    AllObjects find(Object id);

    List<AllObjects> findAll();

    List<AllObjects> findRange(int[] range);

    int count();
    
}
