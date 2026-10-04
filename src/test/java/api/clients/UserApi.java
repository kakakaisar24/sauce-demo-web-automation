package api.clients;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserApi {

    private static final String BASE_URL = "https://dummyapi.io/data/v1";
    private static final String APP_ID = "63a804408eb0cb069b57e43a";

    public Response getUsers() {
        return given()
                .baseUri(BASE_URL)
                .header("app-id", APP_ID)
                .when()
                .get("/user");
    }

    public Response getUserById(String userId) {
        return given()
                .baseUri(BASE_URL)
                .header("app-id", APP_ID)
                .when()
                .get("/user/" + userId);
    }

    public Response createUser(String firstName, String lastName, String email) {
        return given()
                .baseUri(BASE_URL)
                .header("app-id", APP_ID)
                .contentType("application/json")
                .body("""
                        {
                            "firstName": "%s",
                            "lastName": "%s",
                            "email": "%s"
                        }
                        """.formatted(firstName, lastName, email))
                .when()
                .post("/user/create");
    }

    public Response updateUser(String userId, String firstName) {
        return given()
                .baseUri(BASE_URL)
                .header("app-id", APP_ID)
                .contentType("application/json")
                .body("""
                        {
                            "firstName": "%s"
                        }
                        """.formatted(firstName))
                .when()
                .put("/user/" + userId);
    }

    public Response deleteUser(String userId) {
        return given()
                .baseUri(BASE_URL)
                .header("app-id", APP_ID)
                .when()
                .delete("/user/" + userId);
    }

    public Response getTags() {
        return given()
                .baseUri(BASE_URL)
                .header("app-id", APP_ID)
                .when()
                .get("/tag");
    }
}