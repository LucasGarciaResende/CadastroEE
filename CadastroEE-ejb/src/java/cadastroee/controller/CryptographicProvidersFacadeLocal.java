/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.CryptographicProviders;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface CryptographicProvidersFacadeLocal {

    void create(CryptographicProviders cryptographicProviders);

    void edit(CryptographicProviders cryptographicProviders);

    void remove(CryptographicProviders cryptographicProviders);

    CryptographicProviders find(Object id);

    List<CryptographicProviders> findAll();

    List<CryptographicProviders> findRange(int[] range);

    int count();
    
}
