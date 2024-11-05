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
@Table(name = "external_library_files")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLibraryFiles.findAll", query = "SELECT e FROM ExternalLibraryFiles e"),
    @NamedQuery(name = "ExternalLibraryFiles.findByExternalLibraryId", query = "SELECT e FROM ExternalLibraryFiles e WHERE e.externalLibraryId = :externalLibraryId"),
    @NamedQuery(name = "ExternalLibraryFiles.findByPlatform", query = "SELECT e FROM ExternalLibraryFiles e WHERE e.platform = :platform"),
    @NamedQuery(name = "ExternalLibraryFiles.findByPlatformDesc", query = "SELECT e FROM ExternalLibraryFiles e WHERE e.platformDesc = :platformDesc")})
public class ExternalLibraryFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_library_id")
    private int externalLibraryId;
    @Lob
    @Column(name = "content")
    private byte[] content;
    @Column(name = "platform")
    private Short platform;
    @Size(max = 60)
    @Column(name = "platform_desc")
    private String platformDesc;

    public ExternalLibraryFiles() {
    }

    public int getExternalLibraryId() {
        return externalLibraryId;
    }

    public void setExternalLibraryId(int externalLibraryId) {
        this.externalLibraryId = externalLibraryId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    public String getPlatformDesc() {
        return platformDesc;
    }

    public void setPlatformDesc(String platformDesc) {
        this.platformDesc = platformDesc;
    }
    
}
