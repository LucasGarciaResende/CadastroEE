/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ConversationPriorities;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ConversationPrioritiesFacadeLocal {

    void create(ConversationPriorities conversationPriorities);

    void edit(ConversationPriorities conversationPriorities);

    void remove(ConversationPriorities conversationPriorities);

    ConversationPriorities find(Object id);

    List<ConversationPriorities> findAll();

    List<ConversationPriorities> findRange(int[] range);

    int count();
    
}
