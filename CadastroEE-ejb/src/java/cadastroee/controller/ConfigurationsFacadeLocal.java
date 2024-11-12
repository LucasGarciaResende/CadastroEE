/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Configurations;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ConfigurationsFacadeLocal {

    void create(Configurations configurations);

    void edit(Configurations configurations);

    void remove(Configurations configurations);

    Configurations find(Object id);

    List<Configurations> findAll();

    List<Configurations> findRange(int[] range);

    int count();
    
}
