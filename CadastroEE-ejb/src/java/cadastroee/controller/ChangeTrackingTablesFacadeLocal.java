/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ChangeTrackingTables;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ChangeTrackingTablesFacadeLocal {

    void create(ChangeTrackingTables changeTrackingTables);

    void edit(ChangeTrackingTables changeTrackingTables);

    void remove(ChangeTrackingTables changeTrackingTables);

    ChangeTrackingTables find(Object id);

    List<ChangeTrackingTables> findAll();

    List<ChangeTrackingTables> findRange(int[] range);

    int count();
    
}
