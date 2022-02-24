package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Delete {
    private static JSONValue parser;

    public void Delete() throws IOException, ParseException, FileNotFoundException{
        Object obj = parser.parse(new FileReader("/Users/sahilmax/LearnSpring/src/com/company/tmpo.json"));
        System.out.println(obj);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject jsonObject1 = (JSONObject) jsonObject.get("data");
        System.out.println("Got this DATA : "+jsonObject1);
        JSONObject jsonObject2  = (JSONObject) jsonObject1.get("configData");
        String isClassificationEnabledString = (String) jsonObject2.get("IsClassificationEnabled");
        System.out.println("is true ? " + isClassificationEnabledString);
        try {
            JSONArray allowedList = (JSONArray) jsonObject2.get("ClassificationBucketExclusionList");
            System.out.println(allowedList);
            for (Object o : allowedList) {
                System.out.print(o + " ");
            }
        }
        catch(Exception e) {
            System.out.println("data not found in json " + e);
        }
    }
}
