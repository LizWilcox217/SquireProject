package com.automation.utils;

import com.automation.pojos.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DbResponse {

    public static Response post(String body, String endPoint){
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers("Authorization", ConfigReader.getProperty("gr.apiToken"))
                .when()
                .accept(ContentType.JSON)
                .body(body)
                .post(endPoint);
    }

    public static Response put(String body, String endPoint){
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers("Authorization", ConfigReader.getProperty("gr.apiToken"))
                .when()
                .accept(ContentType.JSON)
                .body(body)
                .put(endPoint);
    }

    public static Response getUser(String email){
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers("Authorization",ConfigReader.getProperty("gr.apiToken"))
                .accept(ContentType.JSON)
                .when()
                .pathParam("email", email)
                .get("/users/{email}");
    }

    public static Response getEndpoint(String endPoint){
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers("Authorization", ConfigReader.getProperty("gr.apiToken"))
                .when()
                .get(endPoint);
    }

    public static Response deleteUser(String email){
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers("Authorization", ConfigReader.getProperty("gr.apiToken"))
                .when()
                .pathParam("email", email)
                .delete("/users/{email}");
    }

    public static Response patch(String endPoint, String body){
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .headers("Authorization", ConfigReader.getProperty("gr.apiToken"))
                .when()
                .accept(ContentType.JSON)
                .body(body)
                .patch(endPoint);
    }
}
