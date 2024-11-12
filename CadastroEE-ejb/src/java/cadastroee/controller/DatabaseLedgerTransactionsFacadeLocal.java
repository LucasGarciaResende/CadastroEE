/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseLedgerTransactions;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseLedgerTransactionsFacadeLocal {

    void create(DatabaseLedgerTransactions databaseLedgerTransactions);

    void edit(DatabaseLedgerTransactions databaseLedgerTransactions);

    void remove(DatabaseLedgerTransactions databaseLedgerTransactions);

    DatabaseLedgerTransactions find(Object id);

    List<DatabaseLedgerTransactions> findAll();

    List<DatabaseLedgerTransactions> findRange(int[] range);

    int count();
    
}
