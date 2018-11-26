package com.testing.frameworkautojava;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;
import java.io.IOException;
import java.io.FileNotFoundException;



public class readconfigfile {

    static Properties properties;

    public readconfigfile(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("javaframework/src/test/resources/config.properties"));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found");
        }
    }

    public static String getBrowser(){
        //String Browser = properties.getProperty("Browser");
        String Browser = "Chrome";
        System.out.println(Browser);
        if(Browser!= null)
            return Browser;
        else  return Browser ="firefox";
    }

    public static String getURL() {
        //String url = properties.getProperty("URL");
        String url ="https://courses.ultimateqa.com";
        System.out.println(url);
        return url;

    }
}
