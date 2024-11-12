/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabasePrincipals;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabasePrincipalsFacadeLocal {

    void create(DatabasePrincipals databasePrincipals);

    void edit(DatabasePrincipals databasePrincipals);

    void remove(DatabasePrincipals databasePrincipals);

    DatabasePrincipals find(Object id);

    List<DatabasePrincipals> findAll();

    List<DatabasePrincipals> findRange(int[] range);

    int count();
    
}
