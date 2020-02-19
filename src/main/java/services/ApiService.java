package services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public class ApiService {

    private static final String ACCESS_TOKEN = "ur8ShPdk_YfJJGUBfKSv4vfYKemnxstlpGel";
    private static final String BASE_URI = "https://gorest.co.in/public-api";

    public RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .addHeader("Authorization", "Bearer " + ACCESS_TOKEN)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setRelaxedHTTPSValidation()
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    public ResponseSpecification getResponseSpec() {
        return new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public RequestSpecification setup() {
        return given().spec(getRequestSpec());
    }

//    @SneakyThrows
//    public <T> T getPojo(Class<T> pojo) {
//        return response.as(pojo);
//    }
}
