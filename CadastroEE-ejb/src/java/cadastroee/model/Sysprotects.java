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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "sysprotects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysprotects.findAll", query = "SELECT s FROM Sysprotects s"),
    @NamedQuery(name = "Sysprotects.findById", query = "SELECT s FROM Sysprotects s WHERE s.id = :id"),
    @NamedQuery(name = "Sysprotects.findByUid", query = "SELECT s FROM Sysprotects s WHERE s.uid = :uid"),
    @NamedQuery(name = "Sysprotects.findByAction", query = "SELECT s FROM Sysprotects s WHERE s.action = :action"),
    @NamedQuery(name = "Sysprotects.findByProtecttype", query = "SELECT s FROM Sysprotects s WHERE s.protecttype = :protecttype"),
    @NamedQuery(name = "Sysprotects.findByGrantor", query = "SELECT s FROM Sysprotects s WHERE s.grantor = :grantor")})
public class Sysprotects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Column(name = "uid")
    private Short uid;
    @Column(name = "action")
    private Short action;
    @Column(name = "protecttype")
    private Short protecttype;
    @Lob
    @Column(name = "columns")
    private byte[] columns;
    @Column(name = "grantor")
    private Short grantor;

    public Sysprotects() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Short getAction() {
        return action;
    }

    public void setAction(Short action) {
        this.action = action;
    }

    public Short getProtecttype() {
        return protecttype;
    }

    public void setProtecttype(Short protecttype) {
        this.protecttype = protecttype;
    }

    public byte[] getColumns() {
        return columns;
    }

    public void setColumns(byte[] columns) {
        this.columns = columns;
    }

    public Short getGrantor() {
        return grantor;
    }

    public void setGrantor(Short grantor) {
        this.grantor = grantor;
    }
    
}
