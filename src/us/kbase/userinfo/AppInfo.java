
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
 * <p>Original spec-file type: AppInfo</p>
 * <pre>
 * example narratives should be WS references to the Production ws!
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "version",
    "release_date",
    "author_user_ids",
    "description",
    "src_code_url",
    "rank",
    "usage",
    "screenshots",
    "exampleNarratives"
})
public class AppInfo {

    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("version")
    private java.lang.String version;
    @JsonProperty("release_date")
    private java.lang.String releaseDate;
    @JsonProperty("author_user_ids")
    private List<String> authorUserIds;
    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("src_code_url")
    private java.lang.String srcCodeUrl;
    @JsonProperty("rank")
    private Long rank;
    /**
     * <p>Original spec-file type: AppUsage</p>
     * 
     * 
     */
    @JsonProperty("usage")
    private AppUsage usage;
    @JsonProperty("screenshots")
    private List<String> screenshots;
    @JsonProperty("exampleNarratives")
    private List<String> exampleNarratives;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("name")
    public java.lang.String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public AppInfo withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("version")
    public java.lang.String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    public AppInfo withVersion(java.lang.String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("release_date")
    public java.lang.String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public AppInfo withReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @JsonProperty("author_user_ids")
    public List<String> getAuthorUserIds() {
        return authorUserIds;
    }

    @JsonProperty("author_user_ids")
    public void setAuthorUserIds(List<String> authorUserIds) {
        this.authorUserIds = authorUserIds;
    }

    public AppInfo withAuthorUserIds(List<String> authorUserIds) {
        this.authorUserIds = authorUserIds;
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

    public AppInfo withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("src_code_url")
    public java.lang.String getSrcCodeUrl() {
        return srcCodeUrl;
    }

    @JsonProperty("src_code_url")
    public void setSrcCodeUrl(java.lang.String srcCodeUrl) {
        this.srcCodeUrl = srcCodeUrl;
    }

    public AppInfo withSrcCodeUrl(java.lang.String srcCodeUrl) {
        this.srcCodeUrl = srcCodeUrl;
        return this;
    }

    @JsonProperty("rank")
    public Long getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Long rank) {
        this.rank = rank;
    }

    public AppInfo withRank(Long rank) {
        this.rank = rank;
        return this;
    }

    /**
     * <p>Original spec-file type: AppUsage</p>
     * 
     * 
     */
    @JsonProperty("usage")
    public AppUsage getUsage() {
        return usage;
    }

    /**
     * <p>Original spec-file type: AppUsage</p>
     * 
     * 
     */
    @JsonProperty("usage")
    public void setUsage(AppUsage usage) {
        this.usage = usage;
    }

    public AppInfo withUsage(AppUsage usage) {
        this.usage = usage;
        return this;
    }

    @JsonProperty("screenshots")
    public List<String> getScreenshots() {
        return screenshots;
    }

    @JsonProperty("screenshots")
    public void setScreenshots(List<String> screenshots) {
        this.screenshots = screenshots;
    }

    public AppInfo withScreenshots(List<String> screenshots) {
        this.screenshots = screenshots;
        return this;
    }

    @JsonProperty("exampleNarratives")
    public List<String> getExampleNarratives() {
        return exampleNarratives;
    }

    @JsonProperty("exampleNarratives")
    public void setExampleNarratives(List<String> exampleNarratives) {
        this.exampleNarratives = exampleNarratives;
    }

    public AppInfo withExampleNarratives(List<String> exampleNarratives) {
        this.exampleNarratives = exampleNarratives;
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
        return ((((((((((((((((((((((("AppInfo"+" [name=")+ name)+", version=")+ version)+", releaseDate=")+ releaseDate)+", authorUserIds=")+ authorUserIds)+", description=")+ description)+", srcCodeUrl=")+ srcCodeUrl)+", rank=")+ rank)+", usage=")+ usage)+", screenshots=")+ screenshots)+", exampleNarratives=")+ exampleNarratives)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
