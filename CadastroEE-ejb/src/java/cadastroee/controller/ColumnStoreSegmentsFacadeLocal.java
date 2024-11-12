/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnStoreSegments;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnStoreSegmentsFacadeLocal {

    void create(ColumnStoreSegments columnStoreSegments);

    void edit(ColumnStoreSegments columnStoreSegments);

    void remove(ColumnStoreSegments columnStoreSegments);

    ColumnStoreSegments find(Object id);

    List<ColumnStoreSegments> findAll();

    List<ColumnStoreSegments> findRange(int[] range);

    int count();
    
}
