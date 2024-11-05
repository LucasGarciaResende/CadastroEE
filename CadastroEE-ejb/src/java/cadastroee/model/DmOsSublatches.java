/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@Table(name = "dm_os_sublatches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsSublatches.findAll", query = "SELECT d FROM DmOsSublatches d"),
    @NamedQuery(name = "DmOsSublatches.findByPartitionId", query = "SELECT d FROM DmOsSublatches d WHERE d.partitionId = :partitionId"),
    @NamedQuery(name = "DmOsSublatches.findByClassDesc", query = "SELECT d FROM DmOsSublatches d WHERE d.classDesc = :classDesc"),
    @NamedQuery(name = "DmOsSublatches.findByLatchDesc", query = "SELECT d FROM DmOsSublatches d WHERE d.latchDesc = :latchDesc")})
public class DmOsSublatches implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "superlatch_address")
    private byte[] superlatchAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sublatch_address")
    private byte[] sublatchAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_id")
    private int partitionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "class_desc")
    private String classDesc;
    @Size(max = 256)
    @Column(name = "latch_desc")
    private String latchDesc;

    public DmOsSublatches() {
    }

    public byte[] getSuperlatchAddress() {
        return superlatchAddress;
    }

    public void setSuperlatchAddress(byte[] superlatchAddress) {
        this.superlatchAddress = superlatchAddress;
    }

    public byte[] getSublatchAddress() {
        return sublatchAddress;
    }

    public void setSublatchAddress(byte[] sublatchAddress) {
        this.sublatchAddress = sublatchAddress;
    }

    public int getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(int partitionId) {
        this.partitionId = partitionId;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public String getLatchDesc() {
        return latchDesc;
    }

    public void setLatchDesc(String latchDesc) {
        this.latchDesc = latchDesc;
    }
    
}
