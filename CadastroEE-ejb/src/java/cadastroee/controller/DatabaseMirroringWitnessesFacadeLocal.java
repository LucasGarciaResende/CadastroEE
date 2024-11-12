/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseMirroringWitnesses;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseMirroringWitnessesFacadeLocal {

    void create(DatabaseMirroringWitnesses databaseMirroringWitnesses);

    void edit(DatabaseMirroringWitnesses databaseMirroringWitnesses);

    void remove(DatabaseMirroringWitnesses databaseMirroringWitnesses);

    DatabaseMirroringWitnesses find(Object id);

    List<DatabaseMirroringWitnesses> findAll();

    List<DatabaseMirroringWitnesses> findRange(int[] range);

    int count();
    
}
