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
@Table(name = "dm_clr_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmClrProperties.findAll", query = "SELECT d FROM DmClrProperties d"),
    @NamedQuery(name = "DmClrProperties.findByName", query = "SELECT d FROM DmClrProperties d WHERE d.name = :name"),
    @NamedQuery(name = "DmClrProperties.findByValue", query = "SELECT d FROM DmClrProperties d WHERE d.value = :value")})
public class DmClrProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "value")
    private String value;

    public DmClrProperties() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
