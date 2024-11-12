/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DmAuditActions;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DmAuditActionsFacadeLocal {

    void create(DmAuditActions dmAuditActions);

    void edit(DmAuditActions dmAuditActions);

    void remove(DmAuditActions dmAuditActions);

    DmAuditActions find(Object id);

    List<DmAuditActions> findAll();

    List<DmAuditActions> findRange(int[] range);

    int count();
    
}
