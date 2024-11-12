/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DataSpaces;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DataSpacesFacadeLocal {

    void create(DataSpaces dataSpaces);

    void edit(DataSpaces dataSpaces);

    void remove(DataSpaces dataSpaces);

    DataSpaces find(Object id);

    List<DataSpaces> findAll();

    List<DataSpaces> findRange(int[] range);

    int count();
    
}
