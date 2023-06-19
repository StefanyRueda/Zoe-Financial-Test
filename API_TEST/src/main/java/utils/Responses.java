package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Responses {
    private static Response requestForUsers;
    private static Response updateUsers;

    private Responses(){}

    public static void request(){
        requestForUsers=
                given().baseUri("https://jsonplaceholder.typicode.com/").get("users/8");

    }
    public static void put(){
        updateUsers=
                given().baseUri("https://jsonplaceholder.typicode.com/").body("{\"username\": \"zoe-todaydate\"}").put("users/8");

    }



    public static Response getRequestForUsers() {
        return requestForUsers;
    }

    public static Response getUpdateUsers() {
        return updateUsers;
    }
}
