
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
 * <p>Original spec-file type: KBaseApp</p>
 * <pre>
 * relationship=> author, contributer, tester, etc
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "app_name",
    "description",
    "relationship",
    "url"
})
public class KBaseApp {

    @JsonProperty("app_name")
    private String appName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("relationship")
    private String relationship;
    @JsonProperty("url")
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("app_name")
    public String getAppName() {
        return appName;
    }

    @JsonProperty("app_name")
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public KBaseApp withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public KBaseApp withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public KBaseApp withRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public KBaseApp withUrl(String url) {
        this.url = url;
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
        return ((((((((((("KBaseApp"+" [appName=")+ appName)+", description=")+ description)+", relationship=")+ relationship)+", url=")+ url)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
