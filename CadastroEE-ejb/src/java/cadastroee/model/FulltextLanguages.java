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
@Table(name = "fulltext_languages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextLanguages.findAll", query = "SELECT f FROM FulltextLanguages f"),
    @NamedQuery(name = "FulltextLanguages.findByLcid", query = "SELECT f FROM FulltextLanguages f WHERE f.lcid = :lcid"),
    @NamedQuery(name = "FulltextLanguages.findByName", query = "SELECT f FROM FulltextLanguages f WHERE f.name = :name")})
public class FulltextLanguages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lcid")
    private int lcid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;

    public FulltextLanguages() {
    }

    public int getLcid() {
        return lcid;
    }

    public void setLcid(int lcid) {
        this.lcid = lcid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
