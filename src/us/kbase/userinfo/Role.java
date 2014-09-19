
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
 * <p>Original spec-file type: Role</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "person",
    "role"
})
public class Role {

    /**
     * <p>Original spec-file type: Person</p>
     * <pre>
     * We may want to get rid of this if it is recomputed on the fly.
     * @optional user_info_ref
     * </pre>
     * 
     */
    @JsonProperty("person")
    private Person person;
    @JsonProperty("role")
    private String role;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * <p>Original spec-file type: Person</p>
     * <pre>
     * We may want to get rid of this if it is recomputed on the fly.
     * @optional user_info_ref
     * </pre>
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * <p>Original spec-file type: Person</p>
     * <pre>
     * We may want to get rid of this if it is recomputed on the fly.
     * @optional user_info_ref
     * </pre>
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public Role withPerson(Person person) {
        this.person = person;
        return this;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public Role withRole(String role) {
        this.role = role;
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
        return ((((((("Role"+" [person=")+ person)+", role=")+ role)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
