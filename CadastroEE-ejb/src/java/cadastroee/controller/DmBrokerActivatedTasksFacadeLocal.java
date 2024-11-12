/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DmBrokerActivatedTasks;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DmBrokerActivatedTasksFacadeLocal {

    void create(DmBrokerActivatedTasks dmBrokerActivatedTasks);

    void edit(DmBrokerActivatedTasks dmBrokerActivatedTasks);

    void remove(DmBrokerActivatedTasks dmBrokerActivatedTasks);

    DmBrokerActivatedTasks find(Object id);

    List<DmBrokerActivatedTasks> findAll();

    List<DmBrokerActivatedTasks> findRange(int[] range);

    int count();
    
}
