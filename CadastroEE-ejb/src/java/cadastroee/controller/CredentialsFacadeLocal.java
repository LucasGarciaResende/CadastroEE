/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Credentials;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface CredentialsFacadeLocal {

    void create(Credentials credentials);

    void edit(Credentials credentials);

    void remove(Credentials credentials);

    Credentials find(Object id);

    List<Credentials> findAll();

    List<Credentials> findRange(int[] range);

    int count();
    
}
