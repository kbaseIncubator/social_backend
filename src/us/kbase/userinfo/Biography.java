
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
 * <p>Original spec-file type: Biography</p>
 * <pre>
 * resume type stuff- affliation, education, work history
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "affiliations",
    "degrees"
})
public class Biography {

    @JsonProperty("affiliations")
    private List<Affiliation> affiliations;
    @JsonProperty("degrees")
    private List<Degree> degrees;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("affiliations")
    public List<Affiliation> getAffiliations() {
        return affiliations;
    }

    @JsonProperty("affiliations")
    public void setAffiliations(List<Affiliation> affiliations) {
        this.affiliations = affiliations;
    }

    public Biography withAffiliations(List<Affiliation> affiliations) {
        this.affiliations = affiliations;
        return this;
    }

    @JsonProperty("degrees")
    public List<Degree> getDegrees() {
        return degrees;
    }

    @JsonProperty("degrees")
    public void setDegrees(List<Degree> degrees) {
        this.degrees = degrees;
    }

    public Biography withDegrees(List<Degree> degrees) {
        this.degrees = degrees;
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
        return ((((((("Biography"+" [affiliations=")+ affiliations)+", degrees=")+ degrees)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
