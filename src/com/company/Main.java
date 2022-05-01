package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {
	// write your code here
        HelloWorldTest a = new HelloWorldTest();
        a.main();
        Boy1 Sahil = new Child1();
        Boy1 Ram = new Baby1();
        final String sahil = Sahil.execute("Sahil ");
        System.out.println(sahil);
        final String ram = Ram.execute("Ram ");
        System.out.println(ram);
        GFG1 check = new GFG1();
        check.main();
        Delete check2 = Delete.builder().build();
        JSONObject jsonObject;
        jsonObject = (JSONObject) check2.delete();
        String IsClassificationEnabledString = String.valueOf(jsonObject.get("IsClassificationEnabled"));
        List<String> list = new ArrayList<String>();
        System.out.println(IsClassificationEnabledString);
        if( IsClassificationEnabledString.equals("true") ){
            JSONArray getclassificationBucketExclusionList = (JSONArray) jsonObject.get("ClassificationBucketExclusionList");
            System.out.println(getclassificationBucketExclusionList);
            for(int i = 0; i < getclassificationBucketExclusionList.size(); i++){
                list.add((String) getclassificationBucketExclusionList.get(i));
            }
        }
        for(Object o : list){
            System.out.println(o);
        }
        Filename F = new Filename();
        F.sortAll("./");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        List<Integer> listOfArrayList= arrayList;
        listOfArrayList.stream().map( index -> getDoubleValue(index));
        for(Object o : listOfArrayList){
            System.out.println(o);
        }
        List<String> l = new ArrayList<>();
        l.add("ADDING 1");
        check2 = check2.toBuilder().empty(l).build();
        System.out.println("--->" + check2.empty);
    }

    private static int getDoubleValue(int a){
        System.out.println("its in operation..");
        return 2*a;
    }


}