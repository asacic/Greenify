import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "totalFeatures",
    "features",
    "crs"
})
public class DSource {

    @JsonProperty("type")
    private String type;
    @JsonProperty("totalFeatures")
    private Integer totalFeatures;
    @JsonProperty("features")
    private List<Feature> features = null;
    @JsonProperty("crs")
    private Crs crs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("totalFeatures")
    public Integer getTotalFeatures() {
        return totalFeatures;
    }

    @JsonProperty("totalFeatures")
    public void setTotalFeatures(Integer totalFeatures) {
        this.totalFeatures = totalFeatures;
    }

    @JsonProperty("features")
    public List<Feature> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @JsonProperty("crs")
    public Crs getCrs() {
        return crs;
    }

    @JsonProperty("crs")
    public void setCrs(Crs crs) {
        this.crs = crs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
