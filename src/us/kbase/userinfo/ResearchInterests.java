
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
 * <p>Original spec-file type: ResearchInterests</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "keywords",
    "research_statement"
})
public class ResearchInterests {

    @JsonProperty("keywords")
    private List<String> keywords;
    @JsonProperty("research_statement")
    private java.lang.String researchStatement;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public ResearchInterests withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    @JsonProperty("research_statement")
    public java.lang.String getResearchStatement() {
        return researchStatement;
    }

    @JsonProperty("research_statement")
    public void setResearchStatement(java.lang.String researchStatement) {
        this.researchStatement = researchStatement;
    }

    public ResearchInterests withResearchStatement(java.lang.String researchStatement) {
        this.researchStatement = researchStatement;
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
        return ((((((("ResearchInterests"+" [keywords=")+ keywords)+", researchStatement=")+ researchStatement)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
