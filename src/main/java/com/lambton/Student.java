package com.lambton;

import java.io.IOException;

public class Student {

    int studentID;
    String name;
    public Student()
    {
        this.studentID=1;

        this.name="Rizul";

    }

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void display() throws NameLengthException, IOException

    {

        if (this.name.length()<10)
        {
         throw new NameLengthException("Name Length Invalid");

        }
        System.out.println(studentID);
        System.out.println(name
        );
    }
    @Override
    public String toString() {
        return "Student id " + studentID +  "Student Name" +name;
    }

    @Override
    public void finalize(){
        System.out.println("I am in Finalize Method");
    }
}
