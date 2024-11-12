/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AsymmetricKeys;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AsymmetricKeysFacadeLocal {

    void create(AsymmetricKeys asymmetricKeys);

    void edit(AsymmetricKeys asymmetricKeys);

    void remove(AsymmetricKeys asymmetricKeys);

    AsymmetricKeys find(Object id);

    List<AsymmetricKeys> findAll();

    List<AsymmetricKeys> findRange(int[] range);

    int count();
    
}
