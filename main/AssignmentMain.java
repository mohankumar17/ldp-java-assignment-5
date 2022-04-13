package com.java.assignments.assignment5.mohan.assignment.main;

import com.java.assignments.assignment5.mohan.assignment.data.AssignmentData;
import com.java.assignments.assignment5.mohan.assignment.singleton.AssignmentSingleton;

public class AssignmentMain {
    public static void main(String args[]){
        AssignmentData ob=new AssignmentData();
        ob.printMembers();
        ob.locMethod(); //produces error since loc1 and loc2 are local variables which are not assigned with any values.
        AssignmentSingleton ob2=new AssignmentSingleton();
        ob2.printData();
    }
}
