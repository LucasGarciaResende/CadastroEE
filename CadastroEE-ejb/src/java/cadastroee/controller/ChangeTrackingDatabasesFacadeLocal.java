/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ChangeTrackingDatabases;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ChangeTrackingDatabasesFacadeLocal {

    void create(ChangeTrackingDatabases changeTrackingDatabases);

    void edit(ChangeTrackingDatabases changeTrackingDatabases);

    void remove(ChangeTrackingDatabases changeTrackingDatabases);

    ChangeTrackingDatabases find(Object id);

    List<ChangeTrackingDatabases> findAll();

    List<ChangeTrackingDatabases> findRange(int[] range);

    int count();
    
}
