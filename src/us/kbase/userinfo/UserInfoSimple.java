
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
 * <p>Original spec-file type: UserInfoSimple</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "basic_personal_info",
    "bio",
    "websites",
    "personal_statement",
    "interests",
    "publications",
    "collaborators",
    "my_apps",
    "my_services",
    "resource_usage"
})
public class UserInfoSimple {

    /**
     * <p>Original spec-file type: BasicPersonalInfo</p>
     * <pre>
     * name, address, contact info, etc
     * </pre>
     * 
     */
    @JsonProperty("basic_personal_info")
    private BasicPersonalInfo basicPersonalInfo;
    /**
     * <p>Original spec-file type: Biography</p>
     * <pre>
     * resume type stuff- affliation, education, work history
     * </pre>
     * 
     */
    @JsonProperty("bio")
    private Biography bio;
    @JsonProperty("websites")
    private List<String> websites;
    @JsonProperty("personal_statement")
    private java.lang.String personalStatement;
    /**
     * <p>Original spec-file type: ResearchInterests</p>
     * 
     * 
     */
    @JsonProperty("interests")
    private ResearchInterests interests;
    @JsonProperty("publications")
    private List<Publication> publications;
    @JsonProperty("collaborators")
    private List<Person> collaborators;
    @JsonProperty("my_apps")
    private List<KBaseApp> myApps;
    @JsonProperty("my_services")
    private List<KBaseService> myServices;
    /**
     * <p>Original spec-file type: ResourceUsage</p>
     * 
     * 
     */
    @JsonProperty("resource_usage")
    private ResourceUsage resourceUsage;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * <p>Original spec-file type: BasicPersonalInfo</p>
     * <pre>
     * name, address, contact info, etc
     * </pre>
     * 
     */
    @JsonProperty("basic_personal_info")
    public BasicPersonalInfo getBasicPersonalInfo() {
        return basicPersonalInfo;
    }

    /**
     * <p>Original spec-file type: BasicPersonalInfo</p>
     * <pre>
     * name, address, contact info, etc
     * </pre>
     * 
     */
    @JsonProperty("basic_personal_info")
    public void setBasicPersonalInfo(BasicPersonalInfo basicPersonalInfo) {
        this.basicPersonalInfo = basicPersonalInfo;
    }

    public UserInfoSimple withBasicPersonalInfo(BasicPersonalInfo basicPersonalInfo) {
        this.basicPersonalInfo = basicPersonalInfo;
        return this;
    }

    /**
     * <p>Original spec-file type: Biography</p>
     * <pre>
     * resume type stuff- affliation, education, work history
     * </pre>
     * 
     */
    @JsonProperty("bio")
    public Biography getBio() {
        return bio;
    }

    /**
     * <p>Original spec-file type: Biography</p>
     * <pre>
     * resume type stuff- affliation, education, work history
     * </pre>
     * 
     */
    @JsonProperty("bio")
    public void setBio(Biography bio) {
        this.bio = bio;
    }

    public UserInfoSimple withBio(Biography bio) {
        this.bio = bio;
        return this;
    }

    @JsonProperty("websites")
    public List<String> getWebsites() {
        return websites;
    }

    @JsonProperty("websites")
    public void setWebsites(List<String> websites) {
        this.websites = websites;
    }

    public UserInfoSimple withWebsites(List<String> websites) {
        this.websites = websites;
        return this;
    }

    @JsonProperty("personal_statement")
    public java.lang.String getPersonalStatement() {
        return personalStatement;
    }

    @JsonProperty("personal_statement")
    public void setPersonalStatement(java.lang.String personalStatement) {
        this.personalStatement = personalStatement;
    }

    public UserInfoSimple withPersonalStatement(java.lang.String personalStatement) {
        this.personalStatement = personalStatement;
        return this;
    }

    /**
     * <p>Original spec-file type: ResearchInterests</p>
     * 
     * 
     */
    @JsonProperty("interests")
    public ResearchInterests getInterests() {
        return interests;
    }

    /**
     * <p>Original spec-file type: ResearchInterests</p>
     * 
     * 
     */
    @JsonProperty("interests")
    public void setInterests(ResearchInterests interests) {
        this.interests = interests;
    }

    public UserInfoSimple withInterests(ResearchInterests interests) {
        this.interests = interests;
        return this;
    }

    @JsonProperty("publications")
    public List<Publication> getPublications() {
        return publications;
    }

    @JsonProperty("publications")
    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public UserInfoSimple withPublications(List<Publication> publications) {
        this.publications = publications;
        return this;
    }

    @JsonProperty("collaborators")
    public List<Person> getCollaborators() {
        return collaborators;
    }

    @JsonProperty("collaborators")
    public void setCollaborators(List<Person> collaborators) {
        this.collaborators = collaborators;
    }

    public UserInfoSimple withCollaborators(List<Person> collaborators) {
        this.collaborators = collaborators;
        return this;
    }

    @JsonProperty("my_apps")
    public List<KBaseApp> getMyApps() {
        return myApps;
    }

    @JsonProperty("my_apps")
    public void setMyApps(List<KBaseApp> myApps) {
        this.myApps = myApps;
    }

    public UserInfoSimple withMyApps(List<KBaseApp> myApps) {
        this.myApps = myApps;
        return this;
    }

    @JsonProperty("my_services")
    public List<KBaseService> getMyServices() {
        return myServices;
    }

    @JsonProperty("my_services")
    public void setMyServices(List<KBaseService> myServices) {
        this.myServices = myServices;
    }

    public UserInfoSimple withMyServices(List<KBaseService> myServices) {
        this.myServices = myServices;
        return this;
    }

    /**
     * <p>Original spec-file type: ResourceUsage</p>
     * 
     * 
     */
    @JsonProperty("resource_usage")
    public ResourceUsage getResourceUsage() {
        return resourceUsage;
    }

    /**
     * <p>Original spec-file type: ResourceUsage</p>
     * 
     * 
     */
    @JsonProperty("resource_usage")
    public void setResourceUsage(ResourceUsage resourceUsage) {
        this.resourceUsage = resourceUsage;
    }

    public UserInfoSimple withResourceUsage(ResourceUsage resourceUsage) {
        this.resourceUsage = resourceUsage;
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
        return ((((((((((((((((((((((("UserInfoSimple"+" [basicPersonalInfo=")+ basicPersonalInfo)+", bio=")+ bio)+", websites=")+ websites)+", personalStatement=")+ personalStatement)+", interests=")+ interests)+", publications=")+ publications)+", collaborators=")+ collaborators)+", myApps=")+ myApps)+", myServices=")+ myServices)+", resourceUsage=")+ resourceUsage)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
