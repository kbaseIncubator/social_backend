
package us.kbase.userinfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: Project</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "description",
    "funding_sources",
    "workspace_ids",
    "roles"
})
public class Project {

    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("funding_sources")
    private List<String> fundingSources;
    @JsonProperty("workspace_ids")
    private List<Long> workspaceIds;
    @JsonProperty("roles")
    private List<Role> roles;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("name")
    public java.lang.String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Project withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public java.lang.String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public Project withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("funding_sources")
    public List<String> getFundingSources() {
        return fundingSources;
    }

    @JsonProperty("funding_sources")
    public void setFundingSources(List<String> fundingSources) {
        this.fundingSources = fundingSources;
    }

    public Project withFundingSources(List<String> fundingSources) {
        this.fundingSources = fundingSources;
        return this;
    }

    @JsonProperty("workspace_ids")
    public List<Long> getWorkspaceIds() {
        return workspaceIds;
    }

    @JsonProperty("workspace_ids")
    public void setWorkspaceIds(List<Long> workspaceIds) {
        this.workspaceIds = workspaceIds;
    }

    public Project withWorkspaceIds(List<Long> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }

    @JsonProperty("roles")
    public List<Role> getRoles() {
        return roles;
    }

    @JsonProperty("roles")
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Project withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((("Project"+" [name=")+ name)+", description=")+ description)+", fundingSources=")+ fundingSources)+", workspaceIds=")+ workspaceIds)+", roles=")+ roles)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
