/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseMirroring;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseMirroringFacadeLocal {

    void create(DatabaseMirroring databaseMirroring);

    void edit(DatabaseMirroring databaseMirroring);

    void remove(DatabaseMirroring databaseMirroring);

    DatabaseMirroring find(Object id);

    List<DatabaseMirroring> findAll();

    List<DatabaseMirroring> findRange(int[] range);

    int count();
    
}
