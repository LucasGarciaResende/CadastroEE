/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.CheckConstraints;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface CheckConstraintsFacadeLocal {

    void create(CheckConstraints checkConstraints);

    void edit(CheckConstraints checkConstraints);

    void remove(CheckConstraints checkConstraints);

    CheckConstraints find(Object id);

    List<CheckConstraints> findAll();

    List<CheckConstraints> findRange(int[] range);

    int count();
    
}
