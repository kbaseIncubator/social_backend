
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
 * <p>Original spec-file type: Degree</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "institution",
    "degree",
    "year",
    "inProgress"
})
public class Degree {

    @JsonProperty("institution")
    private String institution;
    @JsonProperty("degree")
    private String degree;
    @JsonProperty("year")
    private Long year;
    @JsonProperty("inProgress")
    private Long inProgress;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("institution")
    public String getInstitution() {
        return institution;
    }

    @JsonProperty("institution")
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Degree withInstitution(String institution) {
        this.institution = institution;
        return this;
    }

    @JsonProperty("degree")
    public String getDegree() {
        return degree;
    }

    @JsonProperty("degree")
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Degree withDegree(String degree) {
        this.degree = degree;
        return this;
    }

    @JsonProperty("year")
    public Long getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Long year) {
        this.year = year;
    }

    public Degree withYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonProperty("inProgress")
    public Long getInProgress() {
        return inProgress;
    }

    @JsonProperty("inProgress")
    public void setInProgress(Long inProgress) {
        this.inProgress = inProgress;
    }

    public Degree withInProgress(Long inProgress) {
        this.inProgress = inProgress;
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
        return ((((((((((("Degree"+" [institution=")+ institution)+", degree=")+ degree)+", year=")+ year)+", inProgress=")+ inProgress)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
