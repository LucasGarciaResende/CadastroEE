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
@Table(name = "schemas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Schemas.findAll", query = "SELECT s FROM Schemas s"),
    @NamedQuery(name = "Schemas.findByName", query = "SELECT s FROM Schemas s WHERE s.name = :name"),
    @NamedQuery(name = "Schemas.findBySchemaId", query = "SELECT s FROM Schemas s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "Schemas.findByPrincipalId", query = "SELECT s FROM Schemas s WHERE s.principalId = :principalId")})
public class Schemas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "schema_id")
    private int schemaId;
    @Column(name = "principal_id")
    private Integer principalId;

    public Schemas() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
