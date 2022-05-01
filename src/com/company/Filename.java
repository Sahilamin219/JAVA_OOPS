package com.company;

import java.io.File;
import java.util.Arrays;
public class Filename {

    //utility method to print a string
    static void print(String value) {
        System.out.println(value);
    }


    /**
     * Method to sort all files and folders in a directory
     *
     * @param dirName : directory name
     * @return : No return value. Sort and print out the result
     */
    public static void sortAll(String dirName) {
        File directory = new File(dirName);

        File[] filesArray = directory.listFiles();
        print( "name is -- " + directory.getName());
        //sort all files
        Arrays.sort(filesArray);

        //print the sorted values
        for (File file : filesArray) {
            if (file.isFile()) {
                print("File : " + file.getName());
            } else if (file.isDirectory()) {
                print("Directory : " + file.getName());
            } else {
                print("Unknown : " + file.getName());
            }
        }
    }


}