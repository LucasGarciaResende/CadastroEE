/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseScopedConfigurations;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseScopedConfigurationsFacadeLocal {

    void create(DatabaseScopedConfigurations databaseScopedConfigurations);

    void edit(DatabaseScopedConfigurations databaseScopedConfigurations);

    void remove(DatabaseScopedConfigurations databaseScopedConfigurations);

    DatabaseScopedConfigurations find(Object id);

    List<DatabaseScopedConfigurations> findAll();

    List<DatabaseScopedConfigurations> findRange(int[] range);

    int count();
    
}
