
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
 * <p>Original spec-file type: BasicPersonalInfo</p>
 * <pre>
 * name, address, contact info, etc
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "real_name",
    "user_name",
    "title",
    "suffix",
    "location",
    "email_addresses"
})
public class BasicPersonalInfo {

    @JsonProperty("real_name")
    private java.lang.String realName;
    @JsonProperty("user_name")
    private java.lang.String userName;
    @JsonProperty("title")
    private java.lang.String title;
    @JsonProperty("suffix")
    private java.lang.String suffix;
    @JsonProperty("location")
    private java.lang.String location;
    @JsonProperty("email_addresses")
    private List<String> emailAddresses;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("real_name")
    public java.lang.String getRealName() {
        return realName;
    }

    @JsonProperty("real_name")
    public void setRealName(java.lang.String realName) {
        this.realName = realName;
    }

    public BasicPersonalInfo withRealName(java.lang.String realName) {
        this.realName = realName;
        return this;
    }

    @JsonProperty("user_name")
    public java.lang.String getUserName() {
        return userName;
    }

    @JsonProperty("user_name")
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    public BasicPersonalInfo withUserName(java.lang.String userName) {
        this.userName = userName;
        return this;
    }

    @JsonProperty("title")
    public java.lang.String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public BasicPersonalInfo withTitle(java.lang.String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("suffix")
    public java.lang.String getSuffix() {
        return suffix;
    }

    @JsonProperty("suffix")
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }

    public BasicPersonalInfo withSuffix(java.lang.String suffix) {
        this.suffix = suffix;
        return this;
    }

    @JsonProperty("location")
    public java.lang.String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    public BasicPersonalInfo withLocation(java.lang.String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("email_addresses")
    public List<String> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("email_addresses")
    public void setEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public BasicPersonalInfo withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
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
        return ((((((((((((((("BasicPersonalInfo"+" [realName=")+ realName)+", userName=")+ userName)+", title=")+ title)+", suffix=")+ suffix)+", location=")+ location)+", emailAddresses=")+ emailAddresses)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
