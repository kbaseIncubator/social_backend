
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
 * <p>Original spec-file type: KBaseService</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "service_name",
    "description",
    "relationship",
    "code_url",
    "service_url",
    "doc_url"
})
public class KBaseService {

    @JsonProperty("service_name")
    private String serviceName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("relationship")
    private String relationship;
    @JsonProperty("code_url")
    private String codeUrl;
    @JsonProperty("service_url")
    private String serviceUrl;
    @JsonProperty("doc_url")
    private String docUrl;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("service_name")
    public String getServiceName() {
        return serviceName;
    }

    @JsonProperty("service_name")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public KBaseService withServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public KBaseService withDescription(String description) {
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

    public KBaseService withRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    @JsonProperty("code_url")
    public String getCodeUrl() {
        return codeUrl;
    }

    @JsonProperty("code_url")
    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public KBaseService withCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }

    @JsonProperty("service_url")
    public String getServiceUrl() {
        return serviceUrl;
    }

    @JsonProperty("service_url")
    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public KBaseService withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    @JsonProperty("doc_url")
    public String getDocUrl() {
        return docUrl;
    }

    @JsonProperty("doc_url")
    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public KBaseService withDocUrl(String docUrl) {
        this.docUrl = docUrl;
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
        return ((((((((((((((("KBaseService"+" [serviceName=")+ serviceName)+", description=")+ description)+", relationship=")+ relationship)+", codeUrl=")+ codeUrl)+", serviceUrl=")+ serviceUrl)+", docUrl=")+ docUrl)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
