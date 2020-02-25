package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import responses.DataItem;
import responses.ResourcesResponse;
import services.ResourcesService;

import java.util.List;

import static org.apache.http.HttpStatus.SC_OK;
import static org.assertj.core.api.Assertions.assertThat;

public class ResourcesSteps {

    @Autowired
    ResourcesService resourcesService;

    Response response;

    @When("User gets resources list")
    public void user_gets_resources_list() {
        response = resourcesService.getResources();
    }

    @Then("Values in the list are:")
    public void values_in_the_list_are(List<DataItem> dataItems) {
        response.then().statusCode(SC_OK);
        ResourcesResponse resourcesResponse = response.as(ResourcesResponse.class);
        List<DataItem> responseList = resourcesResponse.getData();
        assertThat(responseList).isEqualTo(dataItems);
    }
}
