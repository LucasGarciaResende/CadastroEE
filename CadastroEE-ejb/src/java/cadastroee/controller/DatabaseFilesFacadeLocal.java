/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseFiles;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseFilesFacadeLocal {

    void create(DatabaseFiles databaseFiles);

    void edit(DatabaseFiles databaseFiles);

    void remove(DatabaseFiles databaseFiles);

    DatabaseFiles find(Object id);

    List<DatabaseFiles> findAll();

    List<DatabaseFiles> findRange(int[] range);

    int count();
    
}
