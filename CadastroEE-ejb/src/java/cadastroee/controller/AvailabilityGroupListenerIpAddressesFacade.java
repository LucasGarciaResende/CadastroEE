/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.AvailabilityGroupListenerIpAddresses;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author jedim
 */
@Stateless
public class AvailabilityGroupListenerIpAddressesFacade extends AbstractFacade<AvailabilityGroupListenerIpAddresses> implements AvailabilityGroupListenerIpAddressesFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AvailabilityGroupListenerIpAddressesFacade() {
        super(AvailabilityGroupListenerIpAddresses.class);
    }
    
}
