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
@Table(name = "dm_server_external_policy_role_members")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerExternalPolicyRoleMembers.findAll", query = "SELECT d FROM DmServerExternalPolicyRoleMembers d"),
    @NamedQuery(name = "DmServerExternalPolicyRoleMembers.findByPrincipalAadObjectId", query = "SELECT d FROM DmServerExternalPolicyRoleMembers d WHERE d.principalAadObjectId = :principalAadObjectId"),
    @NamedQuery(name = "DmServerExternalPolicyRoleMembers.findByRoleGuid", query = "SELECT d FROM DmServerExternalPolicyRoleMembers d WHERE d.roleGuid = :roleGuid"),
    @NamedQuery(name = "DmServerExternalPolicyRoleMembers.findByPolicyGuid", query = "SELECT d FROM DmServerExternalPolicyRoleMembers d WHERE d.policyGuid = :policyGuid"),
    @NamedQuery(name = "DmServerExternalPolicyRoleMembers.findByAssignmentScope", query = "SELECT d FROM DmServerExternalPolicyRoleMembers d WHERE d.assignmentScope = :assignmentScope"),
    @NamedQuery(name = "DmServerExternalPolicyRoleMembers.findByAssignmentType", query = "SELECT d FROM DmServerExternalPolicyRoleMembers d WHERE d.assignmentType = :assignmentType"),
    @NamedQuery(name = "DmServerExternalPolicyRoleMembers.findByAssignmentTypeDesc", query = "SELECT d FROM DmServerExternalPolicyRoleMembers d WHERE d.assignmentTypeDesc = :assignmentTypeDesc")})
public class DmServerExternalPolicyRoleMembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 36)
    @Column(name = "principal_aad_object_id")
    private String principalAadObjectId;
    @Size(max = 128)
    @Column(name = "role_guid")
    private String roleGuid;
    @Size(max = 128)
    @Column(name = "policy_guid")
    private String policyGuid;
    @Size(max = 4000)
    @Column(name = "assignment_scope")
    private String assignmentScope;
    @Column(name = "assignment_type")
    private Integer assignmentType;
    @Size(max = 5)
    @Column(name = "assignment_type_desc")
    private String assignmentTypeDesc;

    public DmServerExternalPolicyRoleMembers() {
    }

    public String getPrincipalAadObjectId() {
        return principalAadObjectId;
    }

    public void setPrincipalAadObjectId(String principalAadObjectId) {
        this.principalAadObjectId = principalAadObjectId;
    }

    public String getRoleGuid() {
        return roleGuid;
    }

    public void setRoleGuid(String roleGuid) {
        this.roleGuid = roleGuid;
    }

    public String getPolicyGuid() {
        return policyGuid;
    }

    public void setPolicyGuid(String policyGuid) {
        this.policyGuid = policyGuid;
    }

    public String getAssignmentScope() {
        return assignmentScope;
    }

    public void setAssignmentScope(String assignmentScope) {
        this.assignmentScope = assignmentScope;
    }

    public Integer getAssignmentType() {
        return assignmentType;
    }

    public void setAssignmentType(Integer assignmentType) {
        this.assignmentType = assignmentType;
    }

    public String getAssignmentTypeDesc() {
        return assignmentTypeDesc;
    }

    public void setAssignmentTypeDesc(String assignmentTypeDesc) {
        this.assignmentTypeDesc = assignmentTypeDesc;
    }
    
}
