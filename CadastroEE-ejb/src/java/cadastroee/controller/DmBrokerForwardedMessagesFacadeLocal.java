/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DmBrokerForwardedMessages;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DmBrokerForwardedMessagesFacadeLocal {

    void create(DmBrokerForwardedMessages dmBrokerForwardedMessages);

    void edit(DmBrokerForwardedMessages dmBrokerForwardedMessages);

    void remove(DmBrokerForwardedMessages dmBrokerForwardedMessages);

    DmBrokerForwardedMessages find(Object id);

    List<DmBrokerForwardedMessages> findAll();

    List<DmBrokerForwardedMessages> findRange(int[] range);

    int count();
    
}
