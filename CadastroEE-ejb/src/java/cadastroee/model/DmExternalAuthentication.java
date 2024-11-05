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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "dm_external_authentication")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalAuthentication.findAll", query = "SELECT d FROM DmExternalAuthentication d"),
    @NamedQuery(name = "DmExternalAuthentication.findByUseIdentity", query = "SELECT d FROM DmExternalAuthentication d WHERE d.useIdentity = :useIdentity"),
    @NamedQuery(name = "DmExternalAuthentication.findByCredentialId", query = "SELECT d FROM DmExternalAuthentication d WHERE d.credentialId = :credentialId"),
    @NamedQuery(name = "DmExternalAuthentication.findByCertificateId", query = "SELECT d FROM DmExternalAuthentication d WHERE d.certificateId = :certificateId")})
public class DmExternalAuthentication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "use_identity")
    private Boolean useIdentity;
    @Column(name = "credential_id")
    private Integer credentialId;
    @Column(name = "certificate_id")
    private Integer certificateId;

    public DmExternalAuthentication() {
    }

    public Boolean getUseIdentity() {
        return useIdentity;
    }

    public void setUseIdentity(Boolean useIdentity) {
        this.useIdentity = useIdentity;
    }

    public Integer getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }
    
}
