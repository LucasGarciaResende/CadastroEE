/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DestinationDataSpaces;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DestinationDataSpacesFacadeLocal {

    void create(DestinationDataSpaces destinationDataSpaces);

    void edit(DestinationDataSpaces destinationDataSpaces);

    void remove(DestinationDataSpaces destinationDataSpaces);

    DestinationDataSpaces find(Object id);

    List<DestinationDataSpaces> findAll();

    List<DestinationDataSpaces> findRange(int[] range);

    int count();
    
}
