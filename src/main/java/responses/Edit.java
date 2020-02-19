package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Edit {

    @JsonProperty("href")
    private String href;

    public void setHref(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }
}