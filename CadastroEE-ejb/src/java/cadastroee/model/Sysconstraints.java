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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "sysconstraints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysconstraints.findAll", query = "SELECT s FROM Sysconstraints s"),
    @NamedQuery(name = "Sysconstraints.findByConstid", query = "SELECT s FROM Sysconstraints s WHERE s.constid = :constid"),
    @NamedQuery(name = "Sysconstraints.findById", query = "SELECT s FROM Sysconstraints s WHERE s.id = :id"),
    @NamedQuery(name = "Sysconstraints.findByColid", query = "SELECT s FROM Sysconstraints s WHERE s.colid = :colid"),
    @NamedQuery(name = "Sysconstraints.findBySpare1", query = "SELECT s FROM Sysconstraints s WHERE s.spare1 = :spare1"),
    @NamedQuery(name = "Sysconstraints.findByStatus", query = "SELECT s FROM Sysconstraints s WHERE s.status = :status"),
    @NamedQuery(name = "Sysconstraints.findByActions", query = "SELECT s FROM Sysconstraints s WHERE s.actions = :actions"),
    @NamedQuery(name = "Sysconstraints.findByError", query = "SELECT s FROM Sysconstraints s WHERE s.error = :error")})
public class Sysconstraints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "constid")
    private int constid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Column(name = "colid")
    private Short colid;
    @Column(name = "spare1")
    private Short spare1;
    @Column(name = "status")
    private Integer status;
    @Column(name = "actions")
    private Integer actions;
    @Column(name = "error")
    private Integer error;

    public Sysconstraints() {
    }

    public int getConstid() {
        return constid;
    }

    public void setConstid(int constid) {
        this.constid = constid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Short getColid() {
        return colid;
    }

    public void setColid(Short colid) {
        this.colid = colid;
    }

    public Short getSpare1() {
        return spare1;
    }

    public void setSpare1(Short spare1) {
        this.spare1 = spare1;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getActions() {
        return actions;
    }

    public void setActions(Integer actions) {
        this.actions = actions;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }
    
}
