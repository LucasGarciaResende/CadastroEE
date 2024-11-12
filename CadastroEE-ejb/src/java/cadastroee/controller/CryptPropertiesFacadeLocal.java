/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.CryptProperties;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface CryptPropertiesFacadeLocal {

    void create(CryptProperties cryptProperties);

    void edit(CryptProperties cryptProperties);

    void remove(CryptProperties cryptProperties);

    CryptProperties find(Object id);

    List<CryptProperties> findAll();

    List<CryptProperties> findRange(int[] range);

    int count();
    
}
