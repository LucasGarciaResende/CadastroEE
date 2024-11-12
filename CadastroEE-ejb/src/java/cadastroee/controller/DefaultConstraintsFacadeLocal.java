/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DefaultConstraints;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DefaultConstraintsFacadeLocal {

    void create(DefaultConstraints defaultConstraints);

    void edit(DefaultConstraints defaultConstraints);

    void remove(DefaultConstraints defaultConstraints);

    DefaultConstraints find(Object id);

    List<DefaultConstraints> findAll();

    List<DefaultConstraints> findRange(int[] range);

    int count();
    
}
