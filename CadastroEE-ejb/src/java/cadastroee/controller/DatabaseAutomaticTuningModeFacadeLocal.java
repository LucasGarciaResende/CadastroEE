/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseAutomaticTuningMode;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseAutomaticTuningModeFacadeLocal {

    void create(DatabaseAutomaticTuningMode databaseAutomaticTuningMode);

    void edit(DatabaseAutomaticTuningMode databaseAutomaticTuningMode);

    void remove(DatabaseAutomaticTuningMode databaseAutomaticTuningMode);

    DatabaseAutomaticTuningMode find(Object id);

    List<DatabaseAutomaticTuningMode> findAll();

    List<DatabaseAutomaticTuningMode> findRange(int[] range);

    int count();
    
}
