
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
 * <p>Original spec-file type: AppReview</p>
 * <pre>
 * rating should be between 1-5
 *   @metadata ws app
 *   @metadata ws user_id
 *   @metadata ws review_text
 *   @metadata ws rating
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "app",
    "user_id",
    "review_text",
    "rating"
})
public class AppReview {

    @JsonProperty("app")
    private String app;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("review_text")
    private String reviewText;
    @JsonProperty("rating")
    private Long rating;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("app")
    public String getApp() {
        return app;
    }

    @JsonProperty("app")
    public void setApp(String app) {
        this.app = app;
    }

    public AppReview withApp(String app) {
        this.app = app;
        return this;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AppReview withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("review_text")
    public String getReviewText() {
        return reviewText;
    }

    @JsonProperty("review_text")
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public AppReview withReviewText(String reviewText) {
        this.reviewText = reviewText;
        return this;
    }

    @JsonProperty("rating")
    public Long getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Long rating) {
        this.rating = rating;
    }

    public AppReview withRating(Long rating) {
        this.rating = rating;
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
        return ((((((((((("AppReview"+" [app=")+ app)+", userId=")+ userId)+", reviewText=")+ reviewText)+", rating=")+ rating)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
