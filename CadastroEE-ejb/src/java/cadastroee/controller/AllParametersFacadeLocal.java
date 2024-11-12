/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AllParameters;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface AllParametersFacadeLocal {

    void create(AllParameters allParameters);

    void edit(AllParameters allParameters);

    void remove(AllParameters allParameters);

    AllParameters find(Object id);

    List<AllParameters> findAll();

    List<AllParameters> findRange(int[] range);

    int count();
    
}
