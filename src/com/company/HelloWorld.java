package com.company;
import lombok.Builder;
@Builder
public class HelloWorld {
    private String Name;
    private String SurName;
    public void main(){
        System.out.println("Hello World");
        System.out.println(Name + SurName);
    }
}