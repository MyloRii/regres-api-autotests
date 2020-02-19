package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCreationResponse {

    @JsonProperty("result")
    private Result result;

    @JsonProperty("_meta")
    private Meta meta;

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }
}