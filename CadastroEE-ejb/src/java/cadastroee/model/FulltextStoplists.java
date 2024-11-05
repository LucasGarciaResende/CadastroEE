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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "fulltext_stoplists")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextStoplists.findAll", query = "SELECT f FROM FulltextStoplists f"),
    @NamedQuery(name = "FulltextStoplists.findByStoplistId", query = "SELECT f FROM FulltextStoplists f WHERE f.stoplistId = :stoplistId"),
    @NamedQuery(name = "FulltextStoplists.findByName", query = "SELECT f FROM FulltextStoplists f WHERE f.name = :name"),
    @NamedQuery(name = "FulltextStoplists.findByCreateDate", query = "SELECT f FROM FulltextStoplists f WHERE f.createDate = :createDate"),
    @NamedQuery(name = "FulltextStoplists.findByModifyDate", query = "SELECT f FROM FulltextStoplists f WHERE f.modifyDate = :modifyDate"),
    @NamedQuery(name = "FulltextStoplists.findByPrincipalId", query = "SELECT f FROM FulltextStoplists f WHERE f.principalId = :principalId")})
public class FulltextStoplists implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stoplist_id")
    private int stoplistId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "principal_id")
    private Integer principalId;

    public FulltextStoplists() {
    }

    public int getStoplistId() {
        return stoplistId;
    }

    public void setStoplistId(int stoplistId) {
        this.stoplistId = stoplistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
