package com.company.classes;

import java.util.List;

public class Frutas {

    public void print_List(List<String> list, StringRepeat i){
       for(String str : list){
           System.out.println("String: " + str + " Modify String: "+ i.String_Test(str));
       }
    }

}
