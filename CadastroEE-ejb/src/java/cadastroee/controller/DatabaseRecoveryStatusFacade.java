/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.DatabaseRecoveryStatus;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author jedim
 */
@Stateless
public class DatabaseRecoveryStatusFacade extends AbstractFacade<DatabaseRecoveryStatus> implements DatabaseRecoveryStatusFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DatabaseRecoveryStatusFacade() {
        super(DatabaseRecoveryStatus.class);
    }
    
}
