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
import java.math.BigInteger;

/**
 *
 * @author jedim
 */
@Entity
@Table(name = "dm_db_fts_index_physical_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbFtsIndexPhysicalStats.findAll", query = "SELECT d FROM DmDbFtsIndexPhysicalStats d"),
    @NamedQuery(name = "DmDbFtsIndexPhysicalStats.findByObjectId", query = "SELECT d FROM DmDbFtsIndexPhysicalStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbFtsIndexPhysicalStats.findByFulltextIndexPageCount", query = "SELECT d FROM DmDbFtsIndexPhysicalStats d WHERE d.fulltextIndexPageCount = :fulltextIndexPageCount"),
    @NamedQuery(name = "DmDbFtsIndexPhysicalStats.findByKeyphraseIndexPageCount", query = "SELECT d FROM DmDbFtsIndexPhysicalStats d WHERE d.keyphraseIndexPageCount = :keyphraseIndexPageCount"),
    @NamedQuery(name = "DmDbFtsIndexPhysicalStats.findBySimilarityIndexPageCount", query = "SELECT d FROM DmDbFtsIndexPhysicalStats d WHERE d.similarityIndexPageCount = :similarityIndexPageCount")})
public class DmDbFtsIndexPhysicalStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "fulltext_index_page_count")
    private BigInteger fulltextIndexPageCount;
    @Column(name = "keyphrase_index_page_count")
    private BigInteger keyphraseIndexPageCount;
    @Column(name = "similarity_index_page_count")
    private BigInteger similarityIndexPageCount;

    public DmDbFtsIndexPhysicalStats() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public BigInteger getFulltextIndexPageCount() {
        return fulltextIndexPageCount;
    }

    public void setFulltextIndexPageCount(BigInteger fulltextIndexPageCount) {
        this.fulltextIndexPageCount = fulltextIndexPageCount;
    }

    public BigInteger getKeyphraseIndexPageCount() {
        return keyphraseIndexPageCount;
    }

    public void setKeyphraseIndexPageCount(BigInteger keyphraseIndexPageCount) {
        this.keyphraseIndexPageCount = keyphraseIndexPageCount;
    }

    public BigInteger getSimilarityIndexPageCount() {
        return similarityIndexPageCount;
    }

    public void setSimilarityIndexPageCount(BigInteger similarityIndexPageCount) {
        this.similarityIndexPageCount = similarityIndexPageCount;
    }
    
}
