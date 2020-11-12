package com.company;

public class StudentData {
    public int id;
    public String fname;
    public double cgpa;

    StudentData(int id , String fname , double cgpa){
        this.id    = id;
        this.cgpa  = cgpa;
        this.fname = fname;
    }
    public int getId(){
        return (this.id);
    }

    public double getCgpa(){
        return (this.cgpa);
    }

    public String getFname(){
        return (this.fname);
    }
}
