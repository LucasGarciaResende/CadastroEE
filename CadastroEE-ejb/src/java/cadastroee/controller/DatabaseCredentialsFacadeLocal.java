/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseCredentials;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseCredentialsFacadeLocal {

    void create(DatabaseCredentials databaseCredentials);

    void edit(DatabaseCredentials databaseCredentials);

    void remove(DatabaseCredentials databaseCredentials);

    DatabaseCredentials find(Object id);

    List<DatabaseCredentials> findAll();

    List<DatabaseCredentials> findRange(int[] range);

    int count();
    
}
