package stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import services.UserService;

import static org.hamcrest.CoreMatchers.is;

public class UsersSteps {

    @Autowired
    UserService userService;

    @Autowired
    User user;

    private Faker faker = new Faker();
    private Response response;

    @When("New user is created")
    public void new_user_is_created() {
        user.setName(faker.name().username());
        user.setJob(faker.job().title());
        response = userService.createUser(user);
    }

    @Then("Status code is: {int} and body and job as expected")
    public void status_code_is_and_body_and_job_as_expected(int statusCode) {
        response.then()
                .statusCode(statusCode)
                .body("name", is(user.getName()))
                .and()
                .body("job", is(user.getJob()));
    }
}
