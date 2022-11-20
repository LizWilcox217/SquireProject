package com.automation.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class Serializers <T> {
    //generics with Jackson may give an exception

    //Serialize given Object and return json response as a String
    public String serialize(T object){
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = null;
        try {
            jsonBody = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonBody;
    }

    //Deserialize given response back into given Object and return that Object
    public T deserialize(T o, Response response){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            o = (T) objectMapper.readValue(response.asString(), o.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}
