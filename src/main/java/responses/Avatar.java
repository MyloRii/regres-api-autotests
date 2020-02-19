package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Avatar {

    @JsonProperty("href")
    private Object href;

    public void setHref(Object href) {
        this.href = href;
    }

    public Object getHref() {
        return href;
    }
}