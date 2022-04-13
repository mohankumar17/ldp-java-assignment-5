package com.java.assignments.assignment5.mohan.assignment.data;

public class AssignmentData {
    private int num;
    private String str;
    public void printMembers(){
        System.out.println(this.num+" "+this.str); //print the default values as default constructor invokes the values to them
    }
    public void locMethod(){
        int loc1,loc2;
        /*System.out.println(loc1);
          System.out.println(loc2); */
        // The loc1 and loc2 are local variables which are Un-initialized. So, they can not be printed
    }
}
