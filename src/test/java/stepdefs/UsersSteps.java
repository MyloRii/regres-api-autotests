package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import responses.UserCreationResponse;
import services.UserService;

import static model.User.builder;
import static org.assertj.core.api.Assertions.assertThat;

public class UsersSteps extends BaseSteps {

    @Autowired
    UserService userService;

    UserCreationResponse userCreationResponse;

    @When("New user is created")
    public void new_user_is_created() {
        User user = builder()
                .firstName(faker.name().username())
                .lastName(faker.name().lastName())
                .gender("male")
                .email(faker.internet().emailAddress())
                .status("active")
                .build();

        Response response = userService.createUser(user);
        response.then().assertThat().statusCode(302);
        userCreationResponse = response.as(UserCreationResponse.class);
    }

    @Then("Following message is received: {string}")
    public void following_message_is_received(String string) {
        assertThat(userCreationResponse.getMeta().getCode()).isEqualTo(201);
        assertThat(userCreationResponse.getMeta().getMessage()).isEqualTo(string);
    }
}
