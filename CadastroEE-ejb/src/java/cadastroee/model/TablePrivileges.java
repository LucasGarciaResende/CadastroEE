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
@Table(name = "TABLE_PRIVILEGES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TablePrivileges.findAll", query = "SELECT t FROM TablePrivileges t"),
    @NamedQuery(name = "TablePrivileges.findByGrantor", query = "SELECT t FROM TablePrivileges t WHERE t.grantor = :grantor"),
    @NamedQuery(name = "TablePrivileges.findByGrantee", query = "SELECT t FROM TablePrivileges t WHERE t.grantee = :grantee"),
    @NamedQuery(name = "TablePrivileges.findByTableCatalog", query = "SELECT t FROM TablePrivileges t WHERE t.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "TablePrivileges.findByTableSchema", query = "SELECT t FROM TablePrivileges t WHERE t.tableSchema = :tableSchema"),
    @NamedQuery(name = "TablePrivileges.findByTableName", query = "SELECT t FROM TablePrivileges t WHERE t.tableName = :tableName"),
    @NamedQuery(name = "TablePrivileges.findByPrivilegeType", query = "SELECT t FROM TablePrivileges t WHERE t.privilegeType = :privilegeType"),
    @NamedQuery(name = "TablePrivileges.findByIsGrantable", query = "SELECT t FROM TablePrivileges t WHERE t.isGrantable = :isGrantable")})
public class TablePrivileges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "GRANTOR")
    private String grantor;
    @Size(max = 128)
    @Column(name = "GRANTEE")
    private String grantee;
    @Size(max = 128)
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Size(max = 128)
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Size(max = 10)
    @Column(name = "PRIVILEGE_TYPE")
    private String privilegeType;
    @Size(max = 3)
    @Column(name = "IS_GRANTABLE")
    private String isGrantable;

    public TablePrivileges() {
    }

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public String getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }
    
}
