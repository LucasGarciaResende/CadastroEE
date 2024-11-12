/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DmBrokerConnections;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DmBrokerConnectionsFacadeLocal {

    void create(DmBrokerConnections dmBrokerConnections);

    void edit(DmBrokerConnections dmBrokerConnections);

    void remove(DmBrokerConnections dmBrokerConnections);

    DmBrokerConnections find(Object id);

    List<DmBrokerConnections> findAll();

    List<DmBrokerConnections> findRange(int[] range);

    int count();
    
}
