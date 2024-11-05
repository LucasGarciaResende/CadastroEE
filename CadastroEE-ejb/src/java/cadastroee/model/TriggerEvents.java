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
@Table(name = "trigger_events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TriggerEvents.findAll", query = "SELECT t FROM TriggerEvents t"),
    @NamedQuery(name = "TriggerEvents.findByObjectId", query = "SELECT t FROM TriggerEvents t WHERE t.objectId = :objectId"),
    @NamedQuery(name = "TriggerEvents.findByType", query = "SELECT t FROM TriggerEvents t WHERE t.type = :type"),
    @NamedQuery(name = "TriggerEvents.findByTypeDesc", query = "SELECT t FROM TriggerEvents t WHERE t.typeDesc = :typeDesc"),
    @NamedQuery(name = "TriggerEvents.findByIsFirst", query = "SELECT t FROM TriggerEvents t WHERE t.isFirst = :isFirst"),
    @NamedQuery(name = "TriggerEvents.findByIsLast", query = "SELECT t FROM TriggerEvents t WHERE t.isLast = :isLast"),
    @NamedQuery(name = "TriggerEvents.findByEventGroupType", query = "SELECT t FROM TriggerEvents t WHERE t.eventGroupType = :eventGroupType"),
    @NamedQuery(name = "TriggerEvents.findByEventGroupTypeDesc", query = "SELECT t FROM TriggerEvents t WHERE t.eventGroupTypeDesc = :eventGroupTypeDesc"),
    @NamedQuery(name = "TriggerEvents.findByIsTriggerEvent", query = "SELECT t FROM TriggerEvents t WHERE t.isTriggerEvent = :isTriggerEvent")})
public class TriggerEvents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private int type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "is_first")
    private Boolean isFirst;
    @Column(name = "is_last")
    private Boolean isLast;
    @Column(name = "event_group_type")
    private Integer eventGroupType;
    @Size(max = 128)
    @Column(name = "event_group_type_desc")
    private String eventGroupTypeDesc;
    @Column(name = "is_trigger_event")
    private Boolean isTriggerEvent;

    public TriggerEvents() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Boolean getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }

    public Boolean getIsLast() {
        return isLast;
    }

    public void setIsLast(Boolean isLast) {
        this.isLast = isLast;
    }

    public Integer getEventGroupType() {
        return eventGroupType;
    }

    public void setEventGroupType(Integer eventGroupType) {
        this.eventGroupType = eventGroupType;
    }

    public String getEventGroupTypeDesc() {
        return eventGroupTypeDesc;
    }

    public void setEventGroupTypeDesc(String eventGroupTypeDesc) {
        this.eventGroupTypeDesc = eventGroupTypeDesc;
    }

    public Boolean getIsTriggerEvent() {
        return isTriggerEvent;
    }

    public void setIsTriggerEvent(Boolean isTriggerEvent) {
        this.isTriggerEvent = isTriggerEvent;
    }
    
}
