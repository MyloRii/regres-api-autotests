package services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import org.springframework.stereotype.Component;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static java.util.List.of;

@Component
public class ApiService {

    private static final String BASE_URI = "https://reqres.in/api";

    private List<Filter> filterList = of(
            new RequestLoggingFilter(),
            new ResponseLoggingFilter(),
            new ErrorLoggingFilter()
    );

    public RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setAccept(JSON)
                .setContentType(JSON)
                .setRelaxedHTTPSValidation()
                .addFilters(filterList)
                .build();
    }

    public RequestSpecification setup() {
        return given().spec(getRequestSpec());
    }
}
