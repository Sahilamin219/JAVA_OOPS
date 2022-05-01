package com.company;

import lombok.Builder;
import lombok.Getter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder(toBuilder = true)
public class Delete {
    private static JSONValue parser;
    @Builder.Default
    public List<String> empty = new ArrayList<>();

    public JSONObject delete() throws IOException, ParseException, FileNotFoundException{
//        Object obj = parser.parse(new FileReader("./src/com/company/tmpo.json"));
//        JSONObject jsonObject = (JSONObject) obj;
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObjectSecondary = new JSONObject();
        JSONObject jsonObjectPrimary = new JSONObject();
        jsonObject.put("contextual_parameters" ,  " business: RETAIL," +
                "businessGroup: VENDOR_MANAGED_INVENTORY," +
                "RNIISourceName: distributor_shipment_item");
        JSONArray tmp1 = new JSONArray();
        JSONArray tmp2 = new JSONArray();
        tmp1.add("REBNI_COUNTING_ERROR_OVERAGE");
        tmp1.add("UNCATEGORIZED_OVERAGE");
        jsonObjectPrimary.put("ClassificationBucketExclusionList" , tmp1);
        jsonObjectPrimary.put("ClassificationBucketAllowedList" , tmp2);
        jsonObjectPrimary.put("IsClassificationEnabled", "true");

        jsonObjectSecondary.put("contentType", "json");
        jsonObjectSecondary.put("configData",jsonObjectPrimary );
        jsonObject.put("data", jsonObjectSecondary);

        System.out.println(" WATCH THIS : " + jsonObject);
        JSONObject jsonObject1 = (JSONObject) jsonObject.get("data");
        System.out.println("Got this DATA : "+jsonObject1);
        JSONObject jsonObject2  = (JSONObject) jsonObject1.get("configData");
        System.out.println(" JSON OBJECT 2: "+jsonObject2);
        return jsonObject2;
//        String isClassificationEnabledString = (String) jsonObject2.get("IsClassificationEnabled");
//        System.out.println("is true ? " + isClassificationEnabledString);
//        try {
//            JSONArray allowedList = (JSONArray) jsonObject2.get("ClassificationBucketExclusionList");
//            System.out.println(allowedList);
//            for (Object o : allowedList) {
//                System.out.print(o + " ");
//            }
//        }
//        catch(Exception e) {
//            System.out.println("data not found in json " + e);
//        }
    }
}
