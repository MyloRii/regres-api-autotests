package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Data
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class User {

    @JsonProperty("name")
    private String name;

    @JsonProperty("job")
    private String job;
}