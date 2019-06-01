package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.get().stream().findFirst().orElse(null);
    }


}
class  Student{
    public Student(){

    }
    List<String>  list;
    public List<String>  get(){
        return  list;
    }



}