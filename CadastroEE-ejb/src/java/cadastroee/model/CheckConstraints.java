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
@Table(name = "check_constraints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CheckConstraints.findAll", query = "SELECT c FROM CheckConstraints c"),
    @NamedQuery(name = "CheckConstraints.findByConstraintCatalog", query = "SELECT c FROM CheckConstraints c WHERE c.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "CheckConstraints.findByConstraintSchema", query = "SELECT c FROM CheckConstraints c WHERE c.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "CheckConstraints.findByConstraintName", query = "SELECT c FROM CheckConstraints c WHERE c.constraintName = :constraintName"),
    @NamedQuery(name = "CheckConstraints.findByCheckClause", query = "SELECT c FROM CheckConstraints c WHERE c.checkClause = :checkClause"),
    @NamedQuery(name = "CheckConstraints.findByName", query = "SELECT c FROM CheckConstraints c WHERE c.name = :name"),
    @NamedQuery(name = "CheckConstraints.findByObjectId", query = "SELECT c FROM CheckConstraints c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "CheckConstraints.findByPrincipalId", query = "SELECT c FROM CheckConstraints c WHERE c.principalId = :principalId"),
    @NamedQuery(name = "CheckConstraints.findBySchemaId", query = "SELECT c FROM CheckConstraints c WHERE c.schemaId = :schemaId"),
    @NamedQuery(name = "CheckConstraints.findByParentObjectId", query = "SELECT c FROM CheckConstraints c WHERE c.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "CheckConstraints.findByType", query = "SELECT c FROM CheckConstraints c WHERE c.type = :type"),
    @NamedQuery(name = "CheckConstraints.findByTypeDesc", query = "SELECT c FROM CheckConstraints c WHERE c.typeDesc = :typeDesc"),
    @NamedQuery(name = "CheckConstraints.findByCreateDate", query = "SELECT c FROM CheckConstraints c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "CheckConstraints.findByModifyDate", query = "SELECT c FROM CheckConstraints c WHERE c.modifyDate = :modifyDate"),
    @NamedQuery(name = "CheckConstraints.findByIsMsShipped", query = "SELECT c FROM CheckConstraints c WHERE c.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "CheckConstraints.findByIsPublished", query = "SELECT c FROM CheckConstraints c WHERE c.isPublished = :isPublished"),
    @NamedQuery(name = "CheckConstraints.findByIsSchemaPublished", query = "SELECT c FROM CheckConstraints c WHERE c.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "CheckConstraints.findByIsDisabled", query = "SELECT c FROM CheckConstraints c WHERE c.isDisabled = :isDisabled"),
    @NamedQuery(name = "CheckConstraints.findByIsNotForReplication", query = "SELECT c FROM CheckConstraints c WHERE c.isNotForReplication = :isNotForReplication"),
    @NamedQuery(name = "CheckConstraints.findByIsNotTrusted", query = "SELECT c FROM CheckConstraints c WHERE c.isNotTrusted = :isNotTrusted"),
    @NamedQuery(name = "CheckConstraints.findByParentColumnId", query = "SELECT c FROM CheckConstraints c WHERE c.parentColumnId = :parentColumnId"),
    @NamedQuery(name = "CheckConstraints.findByDefinition", query = "SELECT c FROM CheckConstraints c WHERE c.definition = :definition"),
    @NamedQuery(name = "CheckConstraints.findByUsesDatabaseCollation", query = "SELECT c FROM CheckConstraints c WHERE c.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "CheckConstraints.findByIsSystemNamed", query = "SELECT c FROM CheckConstraints c WHERE c.isSystemNamed = :isSystemNamed")})

public class CheckConstraints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Size(max = 4000)
    @Column(name = "CHECK_CLAUSE")
    private String checkClause;
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
    @Column(name = "is_disabled")
    private boolean isDisabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_not_for_replication")
    private boolean isNotForReplication;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_not_trusted")
    private boolean isNotTrusted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_column_id")
    private int parentColumnId;
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;
    @Column(name = "uses_database_collation")
    private Boolean usesDatabaseCollation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system_named")
    private boolean isSystemNamed;

    public CheckConstraints() {
    }

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getCheckClause() {
        return checkClause;
    }

    public void setCheckClause(String checkClause) {
        this.checkClause = checkClause;
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

    public boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public boolean getIsNotForReplication() {
        return isNotForReplication;
    }

    public void setIsNotForReplication(boolean isNotForReplication) {
        this.isNotForReplication = isNotForReplication;
    }

    public boolean getIsNotTrusted() {
        return isNotTrusted;
    }

    public void setIsNotTrusted(boolean isNotTrusted) {
        this.isNotTrusted = isNotTrusted;
    }

    public int getParentColumnId() {
        return parentColumnId;
    }

    public void setParentColumnId(int parentColumnId) {
        this.parentColumnId = parentColumnId;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Boolean getUsesDatabaseCollation() {
        return usesDatabaseCollation;
    }

    public void setUsesDatabaseCollation(Boolean usesDatabaseCollation) {
        this.usesDatabaseCollation = usesDatabaseCollation;
    }

    public boolean getIsSystemNamed() {
        return isSystemNamed;
    }

    public void setIsSystemNamed(boolean isSystemNamed) {
        this.isSystemNamed = isSystemNamed;
    }
}
