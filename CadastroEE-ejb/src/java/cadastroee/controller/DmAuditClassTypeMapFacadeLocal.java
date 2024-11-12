/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DmAuditClassTypeMap;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DmAuditClassTypeMapFacadeLocal {

    void create(DmAuditClassTypeMap dmAuditClassTypeMap);

    void edit(DmAuditClassTypeMap dmAuditClassTypeMap);

    void remove(DmAuditClassTypeMap dmAuditClassTypeMap);

    DmAuditClassTypeMap find(Object id);

    List<DmAuditClassTypeMap> findAll();

    List<DmAuditClassTypeMap> findRange(int[] range);

    int count();
    
}
