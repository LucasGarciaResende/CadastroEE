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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "database_ledger_blocks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseLedgerBlocks.findAll", query = "SELECT d FROM DatabaseLedgerBlocks d"),
    @NamedQuery(name = "DatabaseLedgerBlocks.findByBlockId", query = "SELECT d FROM DatabaseLedgerBlocks d WHERE d.blockId = :blockId"),
    @NamedQuery(name = "DatabaseLedgerBlocks.findByBlockSize", query = "SELECT d FROM DatabaseLedgerBlocks d WHERE d.blockSize = :blockSize")})
public class DatabaseLedgerBlocks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "block_id")
    private long blockId;
    @Lob
    @Column(name = "transactions_root_hash")
    private byte[] transactionsRootHash;
    @Basic(optional = false)
    @NotNull
    @Column(name = "block_size")
    private int blockSize;
    @Lob
    @Column(name = "previous_block_hash")
    private byte[] previousBlockHash;

    public DatabaseLedgerBlocks() {
    }

    public long getBlockId() {
        return blockId;
    }

    public void setBlockId(long blockId) {
        this.blockId = blockId;
    }

    public byte[] getTransactionsRootHash() {
        return transactionsRootHash;
    }

    public void setTransactionsRootHash(byte[] transactionsRootHash) {
        this.transactionsRootHash = transactionsRootHash;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public byte[] getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(byte[] previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }
    
}
