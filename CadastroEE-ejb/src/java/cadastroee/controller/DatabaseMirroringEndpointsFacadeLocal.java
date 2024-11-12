/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseMirroringEndpoints;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseMirroringEndpointsFacadeLocal {

    void create(DatabaseMirroringEndpoints databaseMirroringEndpoints);

    void edit(DatabaseMirroringEndpoints databaseMirroringEndpoints);

    void remove(DatabaseMirroringEndpoints databaseMirroringEndpoints);

    DatabaseMirroringEndpoints find(Object id);

    List<DatabaseMirroringEndpoints> findAll();

    List<DatabaseMirroringEndpoints> findRange(int[] range);

    int count();
    
}
