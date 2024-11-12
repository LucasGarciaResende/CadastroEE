/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Certificates;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface CertificatesFacadeLocal {

    void create(Certificates certificates);

    void edit(Certificates certificates);

    void remove(Certificates certificates);

    Certificates find(Object id);

    List<Certificates> findAll();

    List<Certificates> findRange(int[] range);

    int count();
    
}
