package org.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    /*
     * NOTE: uncomment the line to make the test pass...
     */
    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello/matteo")
          .then()
             .statusCode(200)
             .body(is("Hello, matteo!"));
    }

}