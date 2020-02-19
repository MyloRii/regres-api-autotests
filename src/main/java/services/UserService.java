package services;

import io.restassured.response.Response;
import model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class UserService extends ApiService {

    public Response createUser(User user) {
        return setup().body(user).when().post("/users");
    }
}
