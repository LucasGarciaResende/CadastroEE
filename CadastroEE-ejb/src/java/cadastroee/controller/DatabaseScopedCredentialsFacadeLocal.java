/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseScopedCredentials;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseScopedCredentialsFacadeLocal {

    void create(DatabaseScopedCredentials databaseScopedCredentials);

    void edit(DatabaseScopedCredentials databaseScopedCredentials);

    void remove(DatabaseScopedCredentials databaseScopedCredentials);

    DatabaseScopedCredentials find(Object id);

    List<DatabaseScopedCredentials> findAll();

    List<DatabaseScopedCredentials> findRange(int[] range);

    int count();
    
}
