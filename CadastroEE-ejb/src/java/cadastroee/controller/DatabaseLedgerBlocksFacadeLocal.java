/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseLedgerBlocks;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseLedgerBlocksFacadeLocal {

    void create(DatabaseLedgerBlocks databaseLedgerBlocks);

    void edit(DatabaseLedgerBlocks databaseLedgerBlocks);

    void remove(DatabaseLedgerBlocks databaseLedgerBlocks);

    DatabaseLedgerBlocks find(Object id);

    List<DatabaseLedgerBlocks> findAll();

    List<DatabaseLedgerBlocks> findRange(int[] range);

    int count();
    
}
