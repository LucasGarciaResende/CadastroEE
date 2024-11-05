/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "dm_clr_loaded_assemblies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmClrLoadedAssemblies.findAll", query = "SELECT d FROM DmClrLoadedAssemblies d"),
    @NamedQuery(name = "DmClrLoadedAssemblies.findByAssemblyId", query = "SELECT d FROM DmClrLoadedAssemblies d WHERE d.assemblyId = :assemblyId"),
    @NamedQuery(name = "DmClrLoadedAssemblies.findByLoadTime", query = "SELECT d FROM DmClrLoadedAssemblies d WHERE d.loadTime = :loadTime")})
public class DmClrLoadedAssemblies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "assembly_id")
    private Integer assemblyId;
    @Lob
    @Column(name = "appdomain_address")
    private byte[] appdomainAddress;
    @Column(name = "load_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loadTime;

    public DmClrLoadedAssemblies() {
    }

    public Integer getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(Integer assemblyId) {
        this.assemblyId = assemblyId;
    }

    public byte[] getAppdomainAddress() {
        return appdomainAddress;
    }

    public void setAppdomainAddress(byte[] appdomainAddress) {
        this.appdomainAddress = appdomainAddress;
    }

    public Date getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Date loadTime) {
        this.loadTime = loadTime;
    }
    
}
