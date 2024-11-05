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
@Table(name = "services")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Services.findAll", query = "SELECT s FROM Services s"),
    @NamedQuery(name = "Services.findByName", query = "SELECT s FROM Services s WHERE s.name = :name"),
    @NamedQuery(name = "Services.findByServiceId", query = "SELECT s FROM Services s WHERE s.serviceId = :serviceId"),
    @NamedQuery(name = "Services.findByPrincipalId", query = "SELECT s FROM Services s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "Services.findByServiceQueueId", query = "SELECT s FROM Services s WHERE s.serviceQueueId = :serviceQueueId")})
public class Services implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private int serviceId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_queue_id")
    private int serviceQueueId;

    public Services() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public int getServiceQueueId() {
        return serviceQueueId;
    }

    public void setServiceQueueId(int serviceQueueId) {
        this.serviceQueueId = serviceQueueId;
    }
    
}
