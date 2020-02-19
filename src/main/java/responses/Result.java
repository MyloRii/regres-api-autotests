package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {

    @JsonProperty("website")
    private Object website;

    @JsonProperty("address")
    private Object address;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("phone")
    private Object phone;

    @JsonProperty("_links")
    private Links links;

    @JsonProperty("dob")
    private Object dob;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("status")
    private String status;

    public void setWebsite(Object website) {
        this.website = website;
    }

    public Object getWebsite() {
        return website;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getAddress() {
        return address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getPhone() {
        return phone;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Links getLinks() {
        return links;
    }

    public void setDob(Object dob) {
        this.dob = dob;
    }

    public Object getDob() {
        return dob;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}