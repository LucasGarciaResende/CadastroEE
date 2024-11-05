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
@Table(name = "messages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messages.findAll", query = "SELECT m FROM Messages m"),
    @NamedQuery(name = "Messages.findByMessageId", query = "SELECT m FROM Messages m WHERE m.messageId = :messageId"),
    @NamedQuery(name = "Messages.findByLanguageId", query = "SELECT m FROM Messages m WHERE m.languageId = :languageId"),
    @NamedQuery(name = "Messages.findBySeverity", query = "SELECT m FROM Messages m WHERE m.severity = :severity"),
    @NamedQuery(name = "Messages.findByIsEventLogged", query = "SELECT m FROM Messages m WHERE m.isEventLogged = :isEventLogged"),
    @NamedQuery(name = "Messages.findByText", query = "SELECT m FROM Messages m WHERE m.text = :text")})
public class Messages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "message_id")
    private int messageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private short languageId;
    @Column(name = "severity")
    private Short severity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_event_logged")
    private boolean isEventLogged;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "text")
    private String text;

    public Messages() {
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public short getLanguageId() {
        return languageId;
    }

    public void setLanguageId(short languageId) {
        this.languageId = languageId;
    }

    public Short getSeverity() {
        return severity;
    }

    public void setSeverity(Short severity) {
        this.severity = severity;
    }

    public boolean getIsEventLogged() {
        return isEventLogged;
    }

    public void setIsEventLogged(boolean isEventLogged) {
        this.isEventLogged = isEventLogged;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
