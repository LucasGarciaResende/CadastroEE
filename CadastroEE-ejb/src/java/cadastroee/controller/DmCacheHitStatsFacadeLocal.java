/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DmCacheHitStats;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DmCacheHitStatsFacadeLocal {

    void create(DmCacheHitStats dmCacheHitStats);

    void edit(DmCacheHitStats dmCacheHitStats);

    void remove(DmCacheHitStats dmCacheHitStats);

    DmCacheHitStats find(Object id);

    List<DmCacheHitStats> findAll();

    List<DmCacheHitStats> findRange(int[] range);

    int count();
    
}
