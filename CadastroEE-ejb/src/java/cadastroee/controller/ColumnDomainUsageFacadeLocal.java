/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnDomainUsage;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnDomainUsageFacadeLocal {

    void create(ColumnDomainUsage columnDomainUsage);

    void edit(ColumnDomainUsage columnDomainUsage);

    void remove(ColumnDomainUsage columnDomainUsage);

    ColumnDomainUsage find(Object id);

    List<ColumnDomainUsage> findAll();

    List<ColumnDomainUsage> findRange(int[] range);

    int count();
    
}
