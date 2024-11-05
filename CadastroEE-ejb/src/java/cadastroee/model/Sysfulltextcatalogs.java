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
@Table(name = "sysfulltextcatalogs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysfulltextcatalogs.findAll", query = "SELECT s FROM Sysfulltextcatalogs s"),
    @NamedQuery(name = "Sysfulltextcatalogs.findByFtcatid", query = "SELECT s FROM Sysfulltextcatalogs s WHERE s.ftcatid = :ftcatid"),
    @NamedQuery(name = "Sysfulltextcatalogs.findByName", query = "SELECT s FROM Sysfulltextcatalogs s WHERE s.name = :name"),
    @NamedQuery(name = "Sysfulltextcatalogs.findByStatus", query = "SELECT s FROM Sysfulltextcatalogs s WHERE s.status = :status"),
    @NamedQuery(name = "Sysfulltextcatalogs.findByPath", query = "SELECT s FROM Sysfulltextcatalogs s WHERE s.path = :path")})
public class Sysfulltextcatalogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ftcatid")
    private Short ftcatid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Short status;
    @Size(max = 260)
    @Column(name = "path")
    private String path;

    public Sysfulltextcatalogs() {
    }

    public Short getFtcatid() {
        return ftcatid;
    }

    public void setFtcatid(Short ftcatid) {
        this.ftcatid = ftcatid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
