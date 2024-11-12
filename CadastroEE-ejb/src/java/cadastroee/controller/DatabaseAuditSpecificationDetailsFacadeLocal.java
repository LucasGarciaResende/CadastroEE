/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseAuditSpecificationDetails;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseAuditSpecificationDetailsFacadeLocal {

    void create(DatabaseAuditSpecificationDetails databaseAuditSpecificationDetails);

    void edit(DatabaseAuditSpecificationDetails databaseAuditSpecificationDetails);

    void remove(DatabaseAuditSpecificationDetails databaseAuditSpecificationDetails);

    DatabaseAuditSpecificationDetails find(Object id);

    List<DatabaseAuditSpecificationDetails> findAll();

    List<DatabaseAuditSpecificationDetails> findRange(int[] range);

    int count();
    
}
