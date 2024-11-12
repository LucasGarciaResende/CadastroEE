/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseQueryStoreOptions;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseQueryStoreOptionsFacadeLocal {

    void create(DatabaseQueryStoreOptions databaseQueryStoreOptions);

    void edit(DatabaseQueryStoreOptions databaseQueryStoreOptions);

    void remove(DatabaseQueryStoreOptions databaseQueryStoreOptions);

    DatabaseQueryStoreOptions find(Object id);

    List<DatabaseQueryStoreOptions> findAll();

    List<DatabaseQueryStoreOptions> findRange(int[] range);

    int count();
    
}
