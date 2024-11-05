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
@Table(name = "dm_exec_compute_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecComputePools.findAll", query = "SELECT d FROM DmExecComputePools d"),
    @NamedQuery(name = "DmExecComputePools.findByComputePoolId", query = "SELECT d FROM DmExecComputePools d WHERE d.computePoolId = :computePoolId"),
    @NamedQuery(name = "DmExecComputePools.findByName", query = "SELECT d FROM DmExecComputePools d WHERE d.name = :name"),
    @NamedQuery(name = "DmExecComputePools.findByLocation", query = "SELECT d FROM DmExecComputePools d WHERE d.location = :location")})
public class DmExecComputePools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;
    @Size(max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "location")
    private String location;

    public DmExecComputePools() {
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
