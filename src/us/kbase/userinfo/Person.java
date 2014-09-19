
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
 * <p>Original spec-file type: Person</p>
 * <pre>
 * We may want to get rid of this if it is recomputed on the fly.
 * @optional user_info_ref
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "displayname",
    "username",
    "user_info_ref"
})
public class Person {

    @JsonProperty("displayname")
    private String displayname;
    @JsonProperty("username")
    private String username;
    @JsonProperty("user_info_ref")
    private String userInfoRef;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayname")
    public String getDisplayname() {
        return displayname;
    }

    @JsonProperty("displayname")
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public Person withDisplayname(String displayname) {
        this.displayname = displayname;
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public Person withUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("user_info_ref")
    public String getUserInfoRef() {
        return userInfoRef;
    }

    @JsonProperty("user_info_ref")
    public void setUserInfoRef(String userInfoRef) {
        this.userInfoRef = userInfoRef;
    }

    public Person withUserInfoRef(String userInfoRef) {
        this.userInfoRef = userInfoRef;
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
        return ((((((((("Person"+" [displayname=")+ displayname)+", username=")+ username)+", userInfoRef=")+ userInfoRef)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
