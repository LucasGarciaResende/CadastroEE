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
@Table(name = "query_store_plan_forcing_locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStorePlanForcingLocations.findAll", query = "SELECT q FROM QueryStorePlanForcingLocations q"),
    @NamedQuery(name = "QueryStorePlanForcingLocations.findByPlanForcingLocationId", query = "SELECT q FROM QueryStorePlanForcingLocations q WHERE q.planForcingLocationId = :planForcingLocationId"),
    @NamedQuery(name = "QueryStorePlanForcingLocations.findByQueryId", query = "SELECT q FROM QueryStorePlanForcingLocations q WHERE q.queryId = :queryId"),
    @NamedQuery(name = "QueryStorePlanForcingLocations.findByPlanId", query = "SELECT q FROM QueryStorePlanForcingLocations q WHERE q.planId = :planId"),
    @NamedQuery(name = "QueryStorePlanForcingLocations.findByReplicaGroupId", query = "SELECT q FROM QueryStorePlanForcingLocations q WHERE q.replicaGroupId = :replicaGroupId")})
public class QueryStorePlanForcingLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_forcing_location_id")
    private long planForcingLocationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_id")
    private long queryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_id")
    private long planId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "replica_group_id")
    private long replicaGroupId;

    public QueryStorePlanForcingLocations() {
    }

    public long getPlanForcingLocationId() {
        return planForcingLocationId;
    }

    public void setPlanForcingLocationId(long planForcingLocationId) {
        this.planForcingLocationId = planForcingLocationId;
    }

    public long getQueryId() {
        return queryId;
    }

    public void setQueryId(long queryId) {
        this.queryId = queryId;
    }

    public long getPlanId() {
        return planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
    }

    public long getReplicaGroupId() {
        return replicaGroupId;
    }

    public void setReplicaGroupId(long replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
    }
    
}
