/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseLedgerDigestLocations;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseLedgerDigestLocationsFacadeLocal {

    void create(DatabaseLedgerDigestLocations databaseLedgerDigestLocations);

    void edit(DatabaseLedgerDigestLocations databaseLedgerDigestLocations);

    void remove(DatabaseLedgerDigestLocations databaseLedgerDigestLocations);

    DatabaseLedgerDigestLocations find(Object id);

    List<DatabaseLedgerDigestLocations> findAll();

    List<DatabaseLedgerDigestLocations> findRange(int[] range);

    int count();
    
}
