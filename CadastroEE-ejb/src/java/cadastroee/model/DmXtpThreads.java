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
@Table(name = "dm_xtp_threads")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXtpThreads.findAll", query = "SELECT d FROM DmXtpThreads d"),
    @NamedQuery(name = "DmXtpThreads.findByThreadType", query = "SELECT d FROM DmXtpThreads d WHERE d.threadType = :threadType"),
    @NamedQuery(name = "DmXtpThreads.findByThreadTypeDesc", query = "SELECT d FROM DmXtpThreads d WHERE d.threadTypeDesc = :threadTypeDesc"),
    @NamedQuery(name = "DmXtpThreads.findByRetiredRowCount", query = "SELECT d FROM DmXtpThreads d WHERE d.retiredRowCount = :retiredRowCount"),
    @NamedQuery(name = "DmXtpThreads.findByRetiredTransactionCount", query = "SELECT d FROM DmXtpThreads d WHERE d.retiredTransactionCount = :retiredTransactionCount")})
public class DmXtpThreads implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "thread_address")
    private byte[] threadAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "thread_type")
    private int threadType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "thread_type_desc")
    private String threadTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "retired_row_count")
    private int retiredRowCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "retired_transaction_count")
    private int retiredTransactionCount;

    public DmXtpThreads() {
    }

    public byte[] getThreadAddress() {
        return threadAddress;
    }

    public void setThreadAddress(byte[] threadAddress) {
        this.threadAddress = threadAddress;
    }

    public int getThreadType() {
        return threadType;
    }

    public void setThreadType(int threadType) {
        this.threadType = threadType;
    }

    public String getThreadTypeDesc() {
        return threadTypeDesc;
    }

    public void setThreadTypeDesc(String threadTypeDesc) {
        this.threadTypeDesc = threadTypeDesc;
    }

    public int getRetiredRowCount() {
        return retiredRowCount;
    }

    public void setRetiredRowCount(int retiredRowCount) {
        this.retiredRowCount = retiredRowCount;
    }

    public int getRetiredTransactionCount() {
        return retiredTransactionCount;
    }

    public void setRetiredTransactionCount(int retiredTransactionCount) {
        this.retiredTransactionCount = retiredTransactionCount;
    }
    
}
