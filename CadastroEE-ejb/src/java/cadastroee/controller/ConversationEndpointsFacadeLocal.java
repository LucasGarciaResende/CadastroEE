/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ConversationEndpoints;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ConversationEndpointsFacadeLocal {

    void create(ConversationEndpoints conversationEndpoints);

    void edit(ConversationEndpoints conversationEndpoints);

    void remove(ConversationEndpoints conversationEndpoints);

    ConversationEndpoints find(Object id);

    List<ConversationEndpoints> findAll();

    List<ConversationEndpoints> findRange(int[] range);

    int count();
    
}
