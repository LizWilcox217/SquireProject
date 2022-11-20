package com.automation.stepDefs;

import com.automation.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {
@Before
    public void setUp(){
    ConfigReader.initProperty();
    RestAssured.baseURI = ConfigReader.getProperty("gr.apiHost") + ConfigReader.getProperty("gr.apiVersion");
}
@After
    public void quit(){
    //add later on, nothing needed atm
    System.gc();
    }
}
