package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    public static Properties p;
    public static void initProperty(){
        p = null;
        FileInputStream fs;
        try {
            fs = new FileInputStream("src/test/resources/config.properties");
            p = new Properties();
            p.load(fs);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return p.getProperty(key);
    }

}
