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
@Table(name = "key_encryptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KeyEncryptions.findAll", query = "SELECT k FROM KeyEncryptions k"),
    @NamedQuery(name = "KeyEncryptions.findByKeyId", query = "SELECT k FROM KeyEncryptions k WHERE k.keyId = :keyId"),
    @NamedQuery(name = "KeyEncryptions.findByCryptType", query = "SELECT k FROM KeyEncryptions k WHERE k.cryptType = :cryptType"),
    @NamedQuery(name = "KeyEncryptions.findByCryptTypeDesc", query = "SELECT k FROM KeyEncryptions k WHERE k.cryptTypeDesc = :cryptTypeDesc")})
public class KeyEncryptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "key_id")
    private int keyId;
    @Lob
    @Column(name = "thumbprint")
    private byte[] thumbprint;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "crypt_type")
    private String cryptType;
    @Size(max = 60)
    @Column(name = "crypt_type_desc")
    private String cryptTypeDesc;
    @Lob
    @Column(name = "crypt_property")
    private byte[] cryptProperty;

    public KeyEncryptions() {
    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public String getCryptType() {
        return cryptType;
    }

    public void setCryptType(String cryptType) {
        this.cryptType = cryptType;
    }

    public String getCryptTypeDesc() {
        return cryptTypeDesc;
    }

    public void setCryptTypeDesc(String cryptTypeDesc) {
        this.cryptTypeDesc = cryptTypeDesc;
    }

    public byte[] getCryptProperty() {
        return cryptProperty;
    }

    public void setCryptProperty(byte[] cryptProperty) {
        this.cryptProperty = cryptProperty;
    }
    
}
