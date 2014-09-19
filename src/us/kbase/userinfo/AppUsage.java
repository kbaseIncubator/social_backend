
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
 * <p>Original spec-file type: AppUsage</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "n_users_installed",
    "n_times_run"
})
public class AppUsage {

    @JsonProperty("n_users_installed")
    private Long nUsersInstalled;
    @JsonProperty("n_times_run")
    private Long nTimesRun;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("n_users_installed")
    public Long getNUsersInstalled() {
        return nUsersInstalled;
    }

    @JsonProperty("n_users_installed")
    public void setNUsersInstalled(Long nUsersInstalled) {
        this.nUsersInstalled = nUsersInstalled;
    }

    public AppUsage withNUsersInstalled(Long nUsersInstalled) {
        this.nUsersInstalled = nUsersInstalled;
        return this;
    }

    @JsonProperty("n_times_run")
    public Long getNTimesRun() {
        return nTimesRun;
    }

    @JsonProperty("n_times_run")
    public void setNTimesRun(Long nTimesRun) {
        this.nTimesRun = nTimesRun;
    }

    public AppUsage withNTimesRun(Long nTimesRun) {
        this.nTimesRun = nTimesRun;
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
        return ((((((("AppUsage"+" [nUsersInstalled=")+ nUsersInstalled)+", nTimesRun=")+ nTimesRun)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
