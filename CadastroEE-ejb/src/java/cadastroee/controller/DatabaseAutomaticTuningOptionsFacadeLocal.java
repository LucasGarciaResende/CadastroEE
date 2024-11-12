/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseAutomaticTuningOptions;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseAutomaticTuningOptionsFacadeLocal {

    void create(DatabaseAutomaticTuningOptions databaseAutomaticTuningOptions);

    void edit(DatabaseAutomaticTuningOptions databaseAutomaticTuningOptions);

    void remove(DatabaseAutomaticTuningOptions databaseAutomaticTuningOptions);

    DatabaseAutomaticTuningOptions find(Object id);

    List<DatabaseAutomaticTuningOptions> findAll();

    List<DatabaseAutomaticTuningOptions> findRange(int[] range);

    int count();
    
}
