/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AllViews;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AllViewsFacadeLocal {

    void create(AllViews allViews);

    void edit(AllViews allViews);

    void remove(AllViews allViews);

    AllViews find(Object id);

    List<AllViews> findAll();

    List<AllViews> findRange(int[] range);

    int count();
    
}
