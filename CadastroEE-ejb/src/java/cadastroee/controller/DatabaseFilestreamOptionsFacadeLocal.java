/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseFilestreamOptions;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseFilestreamOptionsFacadeLocal {

    void create(DatabaseFilestreamOptions databaseFilestreamOptions);

    void edit(DatabaseFilestreamOptions databaseFilestreamOptions);

    void remove(DatabaseFilestreamOptions databaseFilestreamOptions);

    DatabaseFilestreamOptions find(Object id);

    List<DatabaseFilestreamOptions> findAll();

    List<DatabaseFilestreamOptions> findRange(int[] range);

    int count();
    
}
