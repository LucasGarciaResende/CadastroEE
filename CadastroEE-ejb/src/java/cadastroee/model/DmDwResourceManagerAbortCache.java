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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "dm_dw_resource_manager_abort_cache")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwResourceManagerAbortCache.findAll", query = "SELECT d FROM DmDwResourceManagerAbortCache d"),
    @NamedQuery(name = "DmDwResourceManagerAbortCache.findByAsn", query = "SELECT d FROM DmDwResourceManagerAbortCache d WHERE d.asn = :asn"),
    @NamedQuery(name = "DmDwResourceManagerAbortCache.findByBsn", query = "SELECT d FROM DmDwResourceManagerAbortCache d WHERE d.bsn = :bsn"),
    @NamedQuery(name = "DmDwResourceManagerAbortCache.findByNestedId", query = "SELECT d FROM DmDwResourceManagerAbortCache d WHERE d.nestedId = :nestedId")})
public class DmDwResourceManagerAbortCache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asn")
    private long asn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bsn")
    private long bsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nested_id")
    private long nestedId;

    public DmDwResourceManagerAbortCache() {
    }

    public long getAsn() {
        return asn;
    }

    public void setAsn(long asn) {
        this.asn = asn;
    }

    public long getBsn() {
        return bsn;
    }

    public void setBsn(long bsn) {
        this.bsn = bsn;
    }

    public long getNestedId() {
        return nestedId;
    }

    public void setNestedId(long nestedId) {
        this.nestedId = nestedId;
    }
    
}
