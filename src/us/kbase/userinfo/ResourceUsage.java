
package us.kbase.userinfo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: ResourceUsage</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "disk_quota",
    "disk_usage",
    "disk_units",
    "cpu_quota",
    "cpu_usage",
    "cpu_units"
})
public class ResourceUsage {

    @JsonProperty("disk_quota")
    private Double diskQuota;
    @JsonProperty("disk_usage")
    private Double diskUsage;
    @JsonProperty("disk_units")
    private String diskUnits;
    @JsonProperty("cpu_quota")
    private Double cpuQuota;
    @JsonProperty("cpu_usage")
    private Double cpuUsage;
    @JsonProperty("cpu_units")
    private String cpuUnits;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("disk_quota")
    public Double getDiskQuota() {
        return diskQuota;
    }

    @JsonProperty("disk_quota")
    public void setDiskQuota(Double diskQuota) {
        this.diskQuota = diskQuota;
    }

    public ResourceUsage withDiskQuota(Double diskQuota) {
        this.diskQuota = diskQuota;
        return this;
    }

    @JsonProperty("disk_usage")
    public Double getDiskUsage() {
        return diskUsage;
    }

    @JsonProperty("disk_usage")
    public void setDiskUsage(Double diskUsage) {
        this.diskUsage = diskUsage;
    }

    public ResourceUsage withDiskUsage(Double diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    @JsonProperty("disk_units")
    public String getDiskUnits() {
        return diskUnits;
    }

    @JsonProperty("disk_units")
    public void setDiskUnits(String diskUnits) {
        this.diskUnits = diskUnits;
    }

    public ResourceUsage withDiskUnits(String diskUnits) {
        this.diskUnits = diskUnits;
        return this;
    }

    @JsonProperty("cpu_quota")
    public Double getCpuQuota() {
        return cpuQuota;
    }

    @JsonProperty("cpu_quota")
    public void setCpuQuota(Double cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    public ResourceUsage withCpuQuota(Double cpuQuota) {
        this.cpuQuota = cpuQuota;
        return this;
    }

    @JsonProperty("cpu_usage")
    public Double getCpuUsage() {
        return cpuUsage;
    }

    @JsonProperty("cpu_usage")
    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public ResourceUsage withCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    @JsonProperty("cpu_units")
    public String getCpuUnits() {
        return cpuUnits;
    }

    @JsonProperty("cpu_units")
    public void setCpuUnits(String cpuUnits) {
        this.cpuUnits = cpuUnits;
    }

    public ResourceUsage withCpuUnits(String cpuUnits) {
        this.cpuUnits = cpuUnits;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((((("ResourceUsage"+" [diskQuota=")+ diskQuota)+", diskUsage=")+ diskUsage)+", diskUnits=")+ diskUnits)+", cpuQuota=")+ cpuQuota)+", cpuUsage=")+ cpuUsage)+", cpuUnits=")+ cpuUnits)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
