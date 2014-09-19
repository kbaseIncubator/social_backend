
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
 * <p>Original spec-file type: Affiliation</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "title",
    "institution",
    "start_year",
    "end_year"
})
public class Affiliation {

    @JsonProperty("title")
    private String title;
    @JsonProperty("institution")
    private String institution;
    @JsonProperty("start_year")
    private Long startYear;
    @JsonProperty("end_year")
    private Long endYear;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Affiliation withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("institution")
    public String getInstitution() {
        return institution;
    }

    @JsonProperty("institution")
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Affiliation withInstitution(String institution) {
        this.institution = institution;
        return this;
    }

    @JsonProperty("start_year")
    public Long getStartYear() {
        return startYear;
    }

    @JsonProperty("start_year")
    public void setStartYear(Long startYear) {
        this.startYear = startYear;
    }

    public Affiliation withStartYear(Long startYear) {
        this.startYear = startYear;
        return this;
    }

    @JsonProperty("end_year")
    public Long getEndYear() {
        return endYear;
    }

    @JsonProperty("end_year")
    public void setEndYear(Long endYear) {
        this.endYear = endYear;
    }

    public Affiliation withEndYear(Long endYear) {
        this.endYear = endYear;
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
        return ((((((((((("Affiliation"+" [title=")+ title)+", institution=")+ institution)+", startYear=")+ startYear)+", endYear=")+ endYear)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
