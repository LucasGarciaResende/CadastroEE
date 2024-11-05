/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "dm_database_external_policy_role_actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDatabaseExternalPolicyRoleActions.findAll", query = "SELECT d FROM DmDatabaseExternalPolicyRoleActions d"),
    @NamedQuery(name = "DmDatabaseExternalPolicyRoleActions.findByRoleGuid", query = "SELECT d FROM DmDatabaseExternalPolicyRoleActions d WHERE d.roleGuid = :roleGuid"),
    @NamedQuery(name = "DmDatabaseExternalPolicyRoleActions.findBySqlActionId", query = "SELECT d FROM DmDatabaseExternalPolicyRoleActions d WHERE d.sqlActionId = :sqlActionId")})
public class DmDatabaseExternalPolicyRoleActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "role_guid")
    private String roleGuid;
    @Column(name = "sql_action_id")
    private Integer sqlActionId;

    public DmDatabaseExternalPolicyRoleActions() {
    }

    public String getRoleGuid() {
        return roleGuid;
    }

    public void setRoleGuid(String roleGuid) {
        this.roleGuid = roleGuid;
    }

    public Integer getSqlActionId() {
        return sqlActionId;
    }

    public void setSqlActionId(Integer sqlActionId) {
        this.sqlActionId = sqlActionId;
    }
    
}
