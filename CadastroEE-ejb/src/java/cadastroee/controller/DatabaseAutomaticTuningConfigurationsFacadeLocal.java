/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseAutomaticTuningConfigurations;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseAutomaticTuningConfigurationsFacadeLocal {

    void create(DatabaseAutomaticTuningConfigurations databaseAutomaticTuningConfigurations);

    void edit(DatabaseAutomaticTuningConfigurations databaseAutomaticTuningConfigurations);

    void remove(DatabaseAutomaticTuningConfigurations databaseAutomaticTuningConfigurations);

    DatabaseAutomaticTuningConfigurations find(Object id);

    List<DatabaseAutomaticTuningConfigurations> findAll();

    List<DatabaseAutomaticTuningConfigurations> findRange(int[] range);

    int count();
    
}
