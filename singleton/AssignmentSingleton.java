package com.java.assignments.assignment5.mohan.assignment.singleton;

public class AssignmentSingleton {
    private String dataStr;
    public static void setData(String newDataStr){
        /*this.dataStr=newDataStr; */
        //static method can't have "this" as it refers to the object.
        //"this" method refers to the current object members/methods but not the static/class members.
    }
    public void printData(){
        System.out.println(this.dataStr); //prints default string (null)
    }
}
