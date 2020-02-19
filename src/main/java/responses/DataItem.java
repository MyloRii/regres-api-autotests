package responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataItem {

    @JsonProperty("color")
    private String color;

    @JsonProperty("year")
    private int year;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private int id;

    @JsonProperty("pantone_value")
    private String pantoneValue;
}