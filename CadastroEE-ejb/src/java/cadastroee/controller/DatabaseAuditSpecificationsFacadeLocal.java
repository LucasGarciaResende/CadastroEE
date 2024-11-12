/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseAuditSpecifications;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseAuditSpecificationsFacadeLocal {

    void create(DatabaseAuditSpecifications databaseAuditSpecifications);

    void edit(DatabaseAuditSpecifications databaseAuditSpecifications);

    void remove(DatabaseAuditSpecifications databaseAuditSpecifications);

    DatabaseAuditSpecifications find(Object id);

    List<DatabaseAuditSpecifications> findAll();

    List<DatabaseAuditSpecifications> findRange(int[] range);

    int count();
    
}
