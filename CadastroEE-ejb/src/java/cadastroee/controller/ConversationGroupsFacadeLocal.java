/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ConversationGroups;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ConversationGroupsFacadeLocal {

    void create(ConversationGroups conversationGroups);

    void edit(ConversationGroups conversationGroups);

    void remove(ConversationGroups conversationGroups);

    ConversationGroups find(Object id);

    List<ConversationGroups> findAll();

    List<ConversationGroups> findRange(int[] range);

    int count();
    
}
