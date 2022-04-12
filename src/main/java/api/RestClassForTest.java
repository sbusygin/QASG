package api;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

public class RestClassForTest {
    @Test
    public void postmanFirstGetTest(){
        RestAssured.
                when().get("http://test-api.d6.dev.devcaz.com/").
                then().assertThat().statusCode(200);
    }

}
