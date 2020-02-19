package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {

    @JsonProperty("edit")
    private Edit edit;

    @JsonProperty("self")
    private Self self;

    @JsonProperty("avatar")
    private Avatar avatar;

    public void setEdit(Edit edit) {
        this.edit = edit;
    }

    public Edit getEdit() {
        return edit;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public Self getSelf() {
        return self;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public Avatar getAvatar() {
        return avatar;
    }
}