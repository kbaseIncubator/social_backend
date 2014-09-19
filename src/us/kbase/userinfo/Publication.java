
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
 * <p>Original spec-file type: Publication</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "full_citation",
    "year",
    "authors",
    "title",
    "journal"
})
public class Publication {

    @JsonProperty("full_citation")
    private String fullCitation;
    @JsonProperty("year")
    private Long year;
    @JsonProperty("authors")
    private String authors;
    @JsonProperty("title")
    private String title;
    @JsonProperty("journal")
    private String journal;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("full_citation")
    public String getFullCitation() {
        return fullCitation;
    }

    @JsonProperty("full_citation")
    public void setFullCitation(String fullCitation) {
        this.fullCitation = fullCitation;
    }

    public Publication withFullCitation(String fullCitation) {
        this.fullCitation = fullCitation;
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

    public Publication withYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonProperty("authors")
    public String getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Publication withAuthors(String authors) {
        this.authors = authors;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Publication withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("journal")
    public String getJournal() {
        return journal;
    }

    @JsonProperty("journal")
    public void setJournal(String journal) {
        this.journal = journal;
    }

    public Publication withJournal(String journal) {
        this.journal = journal;
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
        return ((((((((((((("Publication"+" [fullCitation=")+ fullCitation)+", year=")+ year)+", authors=")+ authors)+", title=")+ title)+", journal=")+ journal)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
