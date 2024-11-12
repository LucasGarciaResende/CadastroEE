/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseRecoveryStatus;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseRecoveryStatusFacadeLocal {

    void create(DatabaseRecoveryStatus databaseRecoveryStatus);

    void edit(DatabaseRecoveryStatus databaseRecoveryStatus);

    void remove(DatabaseRecoveryStatus databaseRecoveryStatus);

    DatabaseRecoveryStatus find(Object id);

    List<DatabaseRecoveryStatus> findAll();

    List<DatabaseRecoveryStatus> findRange(int[] range);

    int count();
    
}
