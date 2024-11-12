/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DmCacheSize;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DmCacheSizeFacadeLocal {

    void create(DmCacheSize dmCacheSize);

    void edit(DmCacheSize dmCacheSize);

    void remove(DmCacheSize dmCacheSize);

    DmCacheSize find(Object id);

    List<DmCacheSize> findAll();

    List<DmCacheSize> findRange(int[] range);

    int count();
    
}
