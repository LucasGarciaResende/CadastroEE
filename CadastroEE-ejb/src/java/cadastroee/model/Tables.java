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
@Table(name = "tables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tables.findAll", query = "SELECT t FROM Tables t"),
    @NamedQuery(name = "Tables.findByTableCatalog", query = "SELECT t FROM Tables t WHERE t.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "Tables.findByTableSchema", query = "SELECT t FROM Tables t WHERE t.tableSchema = :tableSchema"),
    @NamedQuery(name = "Tables.findByTableName", query = "SELECT t FROM Tables t WHERE t.tableName = :tableName"),
    @NamedQuery(name = "Tables.findByTableType", query = "SELECT t FROM Tables t WHERE t.tableType = :tableType"),
    @NamedQuery(name = "Tables.findByName", query = "SELECT t FROM Tables t WHERE t.name = :name"),
    @NamedQuery(name = "Tables.findByObjectId", query = "SELECT t FROM Tables t WHERE t.objectId = :objectId"),
    @NamedQuery(name = "Tables.findByPrincipalId", query = "SELECT t FROM Tables t WHERE t.principalId = :principalId"),
    @NamedQuery(name = "Tables.findBySchemaId", query = "SELECT t FROM Tables t WHERE t.schemaId = :schemaId"),
    @NamedQuery(name = "Tables.findByParentObjectId", query = "SELECT t FROM Tables t WHERE t.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Tables.findByType", query = "SELECT t FROM Tables t WHERE t.type = :type"),
    @NamedQuery(name = "Tables.findByTypeDesc", query = "SELECT t FROM Tables t WHERE t.typeDesc = :typeDesc"),
    @NamedQuery(name = "Tables.findByCreateDate", query = "SELECT t FROM Tables t WHERE t.createDate = :createDate"),
    @NamedQuery(name = "Tables.findByModifyDate", query = "SELECT t FROM Tables t WHERE t.modifyDate = :modifyDate"),
    @NamedQuery(name = "Tables.findByIsMsShipped", query = "SELECT t FROM Tables t WHERE t.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Tables.findByIsPublished", query = "SELECT t FROM Tables t WHERE t.isPublished = :isPublished"),
    @NamedQuery(name = "Tables.findByIsSchemaPublished", query = "SELECT t FROM Tables t WHERE t.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "Tables.findByLobDataSpaceId", query = "SELECT t FROM Tables t WHERE t.lobDataSpaceId = :lobDataSpaceId"),
    @NamedQuery(name = "Tables.findByFilestreamDataSpaceId", query = "SELECT t FROM Tables t WHERE t.filestreamDataSpaceId = :filestreamDataSpaceId"),
    @NamedQuery(name = "Tables.findByMaxColumnIdUsed", query = "SELECT t FROM Tables t WHERE t.maxColumnIdUsed = :maxColumnIdUsed"),
    @NamedQuery(name = "Tables.findByLockOnBulkLoad", query = "SELECT t FROM Tables t WHERE t.lockOnBulkLoad = :lockOnBulkLoad"),
    @NamedQuery(name = "Tables.findByUsesAnsiNulls", query = "SELECT t FROM Tables t WHERE t.usesAnsiNulls = :usesAnsiNulls"),
    @NamedQuery(name = "Tables.findByIsReplicated", query = "SELECT t FROM Tables t WHERE t.isReplicated = :isReplicated"),
    @NamedQuery(name = "Tables.findByHasReplicationFilter", query = "SELECT t FROM Tables t WHERE t.hasReplicationFilter = :hasReplicationFilter"),
    @NamedQuery(name = "Tables.findByIsMergePublished", query = "SELECT t FROM Tables t WHERE t.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "Tables.findByIsSyncTranSubscribed", query = "SELECT t FROM Tables t WHERE t.isSyncTranSubscribed = :isSyncTranSubscribed"),
    @NamedQuery(name = "Tables.findByHasUncheckedAssemblyData", query = "SELECT t FROM Tables t WHERE t.hasUncheckedAssemblyData = :hasUncheckedAssemblyData"),
    @NamedQuery(name = "Tables.findByTextInRowLimit", query = "SELECT t FROM Tables t WHERE t.textInRowLimit = :textInRowLimit"),
    @NamedQuery(name = "Tables.findByLargeValueTypesOutOfRow", query = "SELECT t FROM Tables t WHERE t.largeValueTypesOutOfRow = :largeValueTypesOutOfRow"),
    @NamedQuery(name = "Tables.findByIsTrackedByCdc", query = "SELECT t FROM Tables t WHERE t.isTrackedByCdc = :isTrackedByCdc"),
    @NamedQuery(name = "Tables.findByLockEscalation", query = "SELECT t FROM Tables t WHERE t.lockEscalation = :lockEscalation"),
    @NamedQuery(name = "Tables.findByLockEscalationDesc", query = "SELECT t FROM Tables t WHERE t.lockEscalationDesc = :lockEscalationDesc"),
    @NamedQuery(name = "Tables.findByIsFiletable", query = "SELECT t FROM Tables t WHERE t.isFiletable = :isFiletable"),
    @NamedQuery(name = "Tables.findByIsMemoryOptimized", query = "SELECT t FROM Tables t WHERE t.isMemoryOptimized = :isMemoryOptimized"),
    @NamedQuery(name = "Tables.findByDurability", query = "SELECT t FROM Tables t WHERE t.durability = :durability"),
    @NamedQuery(name = "Tables.findByDurabilityDesc", query = "SELECT t FROM Tables t WHERE t.durabilityDesc = :durabilityDesc"),
    @NamedQuery(name = "Tables.findByTemporalType", query = "SELECT t FROM Tables t WHERE t.temporalType = :temporalType"),
    @NamedQuery(name = "Tables.findByTemporalTypeDesc", query = "SELECT t FROM Tables t WHERE t.temporalTypeDesc = :temporalTypeDesc"),
    @NamedQuery(name = "Tables.findByHistoryTableId", query = "SELECT t FROM Tables t WHERE t.historyTableId = :historyTableId"),
    @NamedQuery(name = "Tables.findByIsRemoteDataArchiveEnabled", query = "SELECT t FROM Tables t WHERE t.isRemoteDataArchiveEnabled = :isRemoteDataArchiveEnabled"),
    @NamedQuery(name = "Tables.findByIsExternal", query = "SELECT t FROM Tables t WHERE t.isExternal = :isExternal"),
    @NamedQuery(name = "Tables.findByHistoryRetentionPeriod", query = "SELECT t FROM Tables t WHERE t.historyRetentionPeriod = :historyRetentionPeriod"),
    @NamedQuery(name = "Tables.findByHistoryRetentionPeriodUnit", query = "SELECT t FROM Tables t WHERE t.historyRetentionPeriodUnit = :historyRetentionPeriodUnit"),
    @NamedQuery(name = "Tables.findByHistoryRetentionPeriodUnitDesc", query = "SELECT t FROM Tables t WHERE t.historyRetentionPeriodUnitDesc = :historyRetentionPeriodUnitDesc"),
    @NamedQuery(name = "Tables.findByIsNode", query = "SELECT t FROM Tables t WHERE t.isNode = :isNode"),
    @NamedQuery(name = "Tables.findByIsEdge", query = "SELECT t FROM Tables t WHERE t.isEdge = :isEdge"),
    @NamedQuery(name = "Tables.findByDataRetentionPeriod", query = "SELECT t FROM Tables t WHERE t.dataRetentionPeriod = :dataRetentionPeriod"),
    @NamedQuery(name = "Tables.findByDataRetentionPeriodUnit", query = "SELECT t FROM Tables t WHERE t.dataRetentionPeriodUnit = :dataRetentionPeriodUnit"),
    @NamedQuery(name = "Tables.findByDataRetentionPeriodUnitDesc", query = "SELECT t FROM Tables t WHERE t.dataRetentionPeriodUnitDesc = :dataRetentionPeriodUnitDesc"),
    @NamedQuery(name = "Tables.findByLedgerType", query = "SELECT t FROM Tables t WHERE t.ledgerType = :ledgerType"),
    @NamedQuery(name = "Tables.findByLedgerTypeDesc", query = "SELECT t FROM Tables t WHERE t.ledgerTypeDesc = :ledgerTypeDesc"),
    @NamedQuery(name = "Tables.findByLedgerViewId", query = "SELECT t FROM Tables t WHERE t.ledgerViewId = :ledgerViewId"),
    @NamedQuery(name = "Tables.findByIsDroppedLedgerTable", query = "SELECT t FROM Tables t WHERE t.isDroppedLedgerTable = :isDroppedLedgerTable")})

public class Tables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Size(max = 128)
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Size(max = 10)
    @Column(name = "TABLE_TYPE")
    private String tableType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "schema_id")
    private int schemaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_object_id")
    private int parentObjectId;
    @Size(max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ms_shipped")
    private boolean isMsShipped;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_published")
    private boolean isPublished;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_schema_published")
    private boolean isSchemaPublished;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lob_data_space_id")
    private int lobDataSpaceId;
    @Column(name = "filestream_data_space_id")
    private Integer filestreamDataSpaceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_column_id_used")
    private int maxColumnIdUsed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lock_on_bulk_load")
    private boolean lockOnBulkLoad;
    @Column(name = "uses_ansi_nulls")
    private Boolean usesAnsiNulls;
    @Column(name = "is_replicated")
    private Boolean isReplicated;
    @Column(name = "has_replication_filter")
    private Boolean hasReplicationFilter;
    @Column(name = "is_merge_published")
    private Boolean isMergePublished;
    @Column(name = "is_sync_tran_subscribed")
    private Boolean isSyncTranSubscribed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_unchecked_assembly_data")
    private boolean hasUncheckedAssemblyData;
    @Column(name = "text_in_row_limit")
    private Integer textInRowLimit;
    @Column(name = "large_value_types_out_of_row")
    private Boolean largeValueTypesOutOfRow;
    @Column(name = "is_tracked_by_cdc")
    private Boolean isTrackedByCdc;
    @Column(name = "lock_escalation")
    private Short lockEscalation;
    @Size(max = 60)
    @Column(name = "lock_escalation_desc")
    private String lockEscalationDesc;
    @Column(name = "is_filetable")
    private Boolean isFiletable;
    @Column(name = "is_memory_optimized")
    private Boolean isMemoryOptimized;
    @Column(name = "durability")
    private Short durability;
    @Size(max = 60)
    @Column(name = "durability_desc")
    private String durabilityDesc;
    @Column(name = "temporal_type")
    private Short temporalType;
    @Size(max = 60)
    @Column(name = "temporal_type_desc")
    private String temporalTypeDesc;
    @Column(name = "history_table_id")
    private Integer historyTableId;
    @Column(name = "is_remote_data_archive_enabled")
    private Boolean isRemoteDataArchiveEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_external")
    private boolean isExternal;
    @Column(name = "history_retention_period")
    private Integer historyRetentionPeriod;
    @Column(name = "history_retention_period_unit")
    private Integer historyRetentionPeriodUnit;
    @Size(max = 10)
    @Column(name = "history_retention_period_unit_desc")
    private String historyRetentionPeriodUnitDesc;
    @Column(name = "is_node")
    private Boolean isNode;
    @Column(name = "is_edge")
    private Boolean isEdge;
    @Column(name = "data_retention_period")
    private Integer dataRetentionPeriod;
    @Column(name = "data_retention_period_unit")
    private Integer dataRetentionPeriodUnit;
    @Size(max = 10)
    @Column(name = "data_retention_period_unit_desc")
    private String dataRetentionPeriodUnitDesc;
    @Column(name = "ledger_type")
    private Short ledgerType;
    @Size(max = 60)
    @Column(name = "ledger_type_desc")
    private String ledgerTypeDesc;
    @Column(name = "ledger_view_id")
    private Integer ledgerViewId;
    @Column(name = "is_dropped_ledger_table")
    private Boolean isDroppedLedgerTable;

    public Tables() {
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public int getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(int parentObjectId) {
        this.parentObjectId = parentObjectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
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

    public boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }

    public boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(boolean isSchemaPublished) {
        this.isSchemaPublished = isSchemaPublished;
    }

    public int getLobDataSpaceId() {
        return lobDataSpaceId;
    }

    public void setLobDataSpaceId(int lobDataSpaceId) {
        this.lobDataSpaceId = lobDataSpaceId;
    }

    public Integer getFilestreamDataSpaceId() {
        return filestreamDataSpaceId;
    }

    public void setFilestreamDataSpaceId(Integer filestreamDataSpaceId) {
        this.filestreamDataSpaceId = filestreamDataSpaceId;
    }

    public int getMaxColumnIdUsed() {
        return maxColumnIdUsed;
    }

    public void setMaxColumnIdUsed(int maxColumnIdUsed) {
        this.maxColumnIdUsed = maxColumnIdUsed;
    }

    public boolean getLockOnBulkLoad() {
        return lockOnBulkLoad;
    }

    public void setLockOnBulkLoad(boolean lockOnBulkLoad) {
        this.lockOnBulkLoad = lockOnBulkLoad;
    }

    public Boolean getUsesAnsiNulls() {
        return usesAnsiNulls;
    }

    public void setUsesAnsiNulls(Boolean usesAnsiNulls) {
        this.usesAnsiNulls = usesAnsiNulls;
    }

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getHasReplicationFilter() {
        return hasReplicationFilter;
    }

    public void setHasReplicationFilter(Boolean hasReplicationFilter) {
        this.hasReplicationFilter = hasReplicationFilter;
    }

    public Boolean getIsMergePublished() {
        return isMergePublished;
    }

    public void setIsMergePublished(Boolean isMergePublished) {
        this.isMergePublished = isMergePublished;
    }

    public Boolean getIsSyncTranSubscribed() {
        return isSyncTranSubscribed;
    }

    public void setIsSyncTranSubscribed(Boolean isSyncTranSubscribed) {
        this.isSyncTranSubscribed = isSyncTranSubscribed;
    }

    public boolean getHasUncheckedAssemblyData() {
        return hasUncheckedAssemblyData;
    }

    public void setHasUncheckedAssemblyData(boolean hasUncheckedAssemblyData) {
        this.hasUncheckedAssemblyData = hasUncheckedAssemblyData;
    }

    public Integer getTextInRowLimit() {
        return textInRowLimit;
    }

    public void setTextInRowLimit(Integer textInRowLimit) {
        this.textInRowLimit = textInRowLimit;
    }

    public Boolean getLargeValueTypesOutOfRow() {
        return largeValueTypesOutOfRow;
    }

    public void setLargeValueTypesOutOfRow(Boolean largeValueTypesOutOfRow) {
        this.largeValueTypesOutOfRow = largeValueTypesOutOfRow;
    }

    public Boolean getIsTrackedByCdc() {
        return isTrackedByCdc;
    }

    public void setIsTrackedByCdc(Boolean isTrackedByCdc) {
        this.isTrackedByCdc = isTrackedByCdc;
    }

    public Short getLockEscalation() {
        return lockEscalation;
    }

    public void setLockEscalation(Short lockEscalation) {
        this.lockEscalation = lockEscalation;
    }

    public String getLockEscalationDesc() {
        return lockEscalationDesc;
    }

    public void setLockEscalationDesc(String lockEscalationDesc) {
        this.lockEscalationDesc = lockEscalationDesc;
    }

    public Boolean getIsFiletable() {
        return isFiletable;
    }

    public void setIsFiletable(Boolean isFiletable) {
        this.isFiletable = isFiletable;
    }

    public Boolean getIsMemoryOptimized() {
        return isMemoryOptimized;
    }

    public void setIsMemoryOptimized(Boolean isMemoryOptimized) {
        this.isMemoryOptimized = isMemoryOptimized;
    }

    public Short getDurability() {
        return durability;
    }

    public void setDurability(Short durability) {
        this.durability = durability;
    }

    public String getDurabilityDesc() {
        return durabilityDesc;
    }

    public void setDurabilityDesc(String durabilityDesc) {
        this.durabilityDesc = durabilityDesc;
    }

    public Short getTemporalType() {
        return temporalType;
    }

    public void setTemporalType(Short temporalType) {
        this.temporalType = temporalType;
    }

    public String getTemporalTypeDesc() {
        return temporalTypeDesc;
    }

    public void setTemporalTypeDesc(String temporalTypeDesc) {
        this.temporalTypeDesc = temporalTypeDesc;
    }

    public Integer getHistoryTableId() {
        return historyTableId;
    }

    public void setHistoryTableId(Integer historyTableId) {
        this.historyTableId = historyTableId;
    }

    public Boolean getIsRemoteDataArchiveEnabled() {
        return isRemoteDataArchiveEnabled;
    }

    public void setIsRemoteDataArchiveEnabled(Boolean isRemoteDataArchiveEnabled) {
        this.isRemoteDataArchiveEnabled = isRemoteDataArchiveEnabled;
    }

    public boolean getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(boolean isExternal) {
        this.isExternal = isExternal;
    }

    public Integer getHistoryRetentionPeriod() {
        return historyRetentionPeriod;
    }

    public void setHistoryRetentionPeriod(Integer historyRetentionPeriod) {
        this.historyRetentionPeriod = historyRetentionPeriod;
    }

    public Integer getHistoryRetentionPeriodUnit() {
        return historyRetentionPeriodUnit;
    }

    public void setHistoryRetentionPeriodUnit(Integer historyRetentionPeriodUnit) {
        this.historyRetentionPeriodUnit = historyRetentionPeriodUnit;
    }

    public String getHistoryRetentionPeriodUnitDesc() {
        return historyRetentionPeriodUnitDesc;
    }

    public void setHistoryRetentionPeriodUnitDesc(String historyRetentionPeriodUnitDesc) {
        this.historyRetentionPeriodUnitDesc = historyRetentionPeriodUnitDesc;
    }

    public Boolean getIsNode() {
        return isNode;
    }

    public void setIsNode(Boolean isNode) {
        this.isNode = isNode;
    }

    public Boolean getIsEdge() {
        return isEdge;
    }

    public void setIsEdge(Boolean isEdge) {
        this.isEdge = isEdge;
    }

    public Integer getDataRetentionPeriod() {
        return dataRetentionPeriod;
    }

    public void setDataRetentionPeriod(Integer dataRetentionPeriod) {
        this.dataRetentionPeriod = dataRetentionPeriod;
    }

    public Integer getDataRetentionPeriodUnit() {
        return dataRetentionPeriodUnit;
    }

    public void setDataRetentionPeriodUnit(Integer dataRetentionPeriodUnit) {
        this.dataRetentionPeriodUnit = dataRetentionPeriodUnit;
    }

    public String getDataRetentionPeriodUnitDesc() {
        return dataRetentionPeriodUnitDesc;
    }

    public void setDataRetentionPeriodUnitDesc(String dataRetentionPeriodUnitDesc) {
        this.dataRetentionPeriodUnitDesc = dataRetentionPeriodUnitDesc;
    }

    public Short getLedgerType() {
        return ledgerType;
    }

    public void setLedgerType(Short ledgerType) {
        this.ledgerType = ledgerType;
    }

    public String getLedgerTypeDesc() {
        return ledgerTypeDesc;
    }

    public void setLedgerTypeDesc(String ledgerTypeDesc) {
        this.ledgerTypeDesc = ledgerTypeDesc;
    }

    public Integer getLedgerViewId() {
        return ledgerViewId;
    }

    public void setLedgerViewId(Integer ledgerViewId) {
        this.ledgerViewId = ledgerViewId;
    }

    public Boolean getIsDroppedLedgerTable() {
        return isDroppedLedgerTable;
    }

    public void setIsDroppedLedgerTable(Boolean isDroppedLedgerTable) {
        this.isDroppedLedgerTable = isDroppedLedgerTable;
    }
}
