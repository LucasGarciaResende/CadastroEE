/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseQueryStoreInternalState;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseQueryStoreInternalStateFacadeLocal {

    void create(DatabaseQueryStoreInternalState databaseQueryStoreInternalState);

    void edit(DatabaseQueryStoreInternalState databaseQueryStoreInternalState);

    void remove(DatabaseQueryStoreInternalState databaseQueryStoreInternalState);

    DatabaseQueryStoreInternalState find(Object id);

    List<DatabaseQueryStoreInternalState> findAll();

    List<DatabaseQueryStoreInternalState> findRange(int[] range);

    int count();
    
}
