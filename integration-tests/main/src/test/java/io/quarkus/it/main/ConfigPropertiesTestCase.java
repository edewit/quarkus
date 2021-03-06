package io.quarkus.it.main;

import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

@QuarkusTest
public class ConfigPropertiesTestCase {

    @Test
    public void testConfigPropertiesProperlyInjected() {
        RestAssured
                .when().get("/configuration-properties")
                .then().body(is("Hello!"));
    }
}
