/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DmBrokerQueueMonitors;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DmBrokerQueueMonitorsFacadeLocal {

    void create(DmBrokerQueueMonitors dmBrokerQueueMonitors);

    void edit(DmBrokerQueueMonitors dmBrokerQueueMonitors);

    void remove(DmBrokerQueueMonitors dmBrokerQueueMonitors);

    DmBrokerQueueMonitors find(Object id);

    List<DmBrokerQueueMonitors> findAll();

    List<DmBrokerQueueMonitors> findRange(int[] range);

    int count();
    
}
