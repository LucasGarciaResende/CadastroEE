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
@Table(name = "dm_database_external_policy_actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findAll", query = "SELECT d FROM DmDatabaseExternalPolicyActions d"),
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findBySqlActionId", query = "SELECT d FROM DmDatabaseExternalPolicyActions d WHERE d.sqlActionId = :sqlActionId"),
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findByActionNamespace", query = "SELECT d FROM DmDatabaseExternalPolicyActions d WHERE d.actionNamespace = :actionNamespace"),
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findByActionType", query = "SELECT d FROM DmDatabaseExternalPolicyActions d WHERE d.actionType = :actionType"),
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findByActionProviderString", query = "SELECT d FROM DmDatabaseExternalPolicyActions d WHERE d.actionProviderString = :actionProviderString")})
public class DmDatabaseExternalPolicyActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "sql_action_id")
    private Integer sqlActionId;
    @Size(max = 256)
    @Column(name = "action_namespace")
    private String actionNamespace;
    @Size(max = 20)
    @Column(name = "action_type")
    private String actionType;
    @Size(max = 20)
    @Column(name = "action_provider_string")
    private String actionProviderString;

    public DmDatabaseExternalPolicyActions() {
    }

    public Integer getSqlActionId() {
        return sqlActionId;
    }

    public void setSqlActionId(Integer sqlActionId) {
        this.sqlActionId = sqlActionId;
    }

    public String getActionNamespace() {
        return actionNamespace;
    }

    public void setActionNamespace(String actionNamespace) {
        this.actionNamespace = actionNamespace;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionProviderString() {
        return actionProviderString;
    }

    public void setActionProviderString(String actionProviderString) {
        this.actionProviderString = actionProviderString;
    }
    
}
