/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseRoleMembers;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface DatabaseRoleMembersFacadeLocal {

    void create(DatabaseRoleMembers databaseRoleMembers);

    void edit(DatabaseRoleMembers databaseRoleMembers);

    void remove(DatabaseRoleMembers databaseRoleMembers);

    DatabaseRoleMembers find(Object id);

    List<DatabaseRoleMembers> findAll();

    List<DatabaseRoleMembers> findRange(int[] range);

    int count();
    
}