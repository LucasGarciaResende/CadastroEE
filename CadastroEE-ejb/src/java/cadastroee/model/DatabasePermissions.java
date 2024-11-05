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
@Table(name = "database_permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabasePermissions.findAll", query = "SELECT d FROM DatabasePermissions d"),
    @NamedQuery(name = "DatabasePermissions.findByClass1", query = "SELECT d FROM DatabasePermissions d WHERE d.class1 = :class1"),
    @NamedQuery(name = "DatabasePermissions.findByClassDesc", query = "SELECT d FROM DatabasePermissions d WHERE d.classDesc = :classDesc"),
    @NamedQuery(name = "DatabasePermissions.findByMajorId", query = "SELECT d FROM DatabasePermissions d WHERE d.majorId = :majorId"),
    @NamedQuery(name = "DatabasePermissions.findByMinorId", query = "SELECT d FROM DatabasePermissions d WHERE d.minorId = :minorId"),
    @NamedQuery(name = "DatabasePermissions.findByGranteePrincipalId", query = "SELECT d FROM DatabasePermissions d WHERE d.granteePrincipalId = :granteePrincipalId"),
    @NamedQuery(name = "DatabasePermissions.findByGrantorPrincipalId", query = "SELECT d FROM DatabasePermissions d WHERE d.grantorPrincipalId = :grantorPrincipalId"),
    @NamedQuery(name = "DatabasePermissions.findByType", query = "SELECT d FROM DatabasePermissions d WHERE d.type = :type"),
    @NamedQuery(name = "DatabasePermissions.findByPermissionName", query = "SELECT d FROM DatabasePermissions d WHERE d.permissionName = :permissionName"),
    @NamedQuery(name = "DatabasePermissions.findByState", query = "SELECT d FROM DatabasePermissions d WHERE d.state = :state"),
    @NamedQuery(name = "DatabasePermissions.findByStateDesc", query = "SELECT d FROM DatabasePermissions d WHERE d.stateDesc = :stateDesc")})
public class DatabasePermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "class")
    private short class1;
    @Size(max = 60)
    @Column(name = "class_desc")
    private String classDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "major_id")
    private int majorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minor_id")
    private int minorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grantee_principal_id")
    private int granteePrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grantor_principal_id")
    private int grantorPrincipalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "type")
    private String type;
    @Size(max = 128)
    @Column(name = "permission_name")
    private String permissionName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private Character state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;

    public DatabasePermissions() {
    }

    public short getClass1() {
        return class1;
    }

    public void setClass1(short class1) {
        this.class1 = class1;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public int getMinorId() {
        return minorId;
    }

    public void setMinorId(int minorId) {
        this.minorId = minorId;
    }

    public int getGranteePrincipalId() {
        return granteePrincipalId;
    }

    public void setGranteePrincipalId(int granteePrincipalId) {
        this.granteePrincipalId = granteePrincipalId;
    }

    public int getGrantorPrincipalId() {
        return grantorPrincipalId;
    }

    public void setGrantorPrincipalId(int grantorPrincipalId) {
        this.grantorPrincipalId = grantorPrincipalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }
    
}
