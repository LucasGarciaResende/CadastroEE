/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "service_contracts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceContracts.findAll", query = "SELECT s FROM ServiceContracts s"),
    @NamedQuery(name = "ServiceContracts.findByName", query = "SELECT s FROM ServiceContracts s WHERE s.name = :name"),
    @NamedQuery(name = "ServiceContracts.findByServiceContractId", query = "SELECT s FROM ServiceContracts s WHERE s.serviceContractId = :serviceContractId"),
    @NamedQuery(name = "ServiceContracts.findByPrincipalId", query = "SELECT s FROM ServiceContracts s WHERE s.principalId = :principalId")})
public class ServiceContracts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_contract_id")
    private int serviceContractId;
    @Column(name = "principal_id")
    private Integer principalId;

    public ServiceContracts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(int serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
