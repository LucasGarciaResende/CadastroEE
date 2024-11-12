/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabasePermissions;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabasePermissionsFacadeLocal {

    void create(DatabasePermissions databasePermissions);

    void edit(DatabasePermissions databasePermissions);

    void remove(DatabasePermissions databasePermissions);

    DatabasePermissions find(Object id);

    List<DatabasePermissions> findAll();

    List<DatabasePermissions> findRange(int[] range);

    int count();
    
}
