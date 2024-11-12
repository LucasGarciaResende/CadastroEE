/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.ColumnXmlSchemaCollectionUsages;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface ColumnXmlSchemaCollectionUsagesFacadeLocal {

    void create(ColumnXmlSchemaCollectionUsages columnXmlSchemaCollectionUsages);

    void edit(ColumnXmlSchemaCollectionUsages columnXmlSchemaCollectionUsages);

    void remove(ColumnXmlSchemaCollectionUsages columnXmlSchemaCollectionUsages);

    ColumnXmlSchemaCollectionUsages find(Object id);

    List<ColumnXmlSchemaCollectionUsages> findAll();

    List<ColumnXmlSchemaCollectionUsages> findRange(int[] range);

    int count();
    
}
