package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {

    @JsonProperty("code")
    private int code;

    @JsonProperty("rateLimit")
    private RateLimit rateLimit;

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("message")
    private String message;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}