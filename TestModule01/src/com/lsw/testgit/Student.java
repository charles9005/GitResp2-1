package com.lsw.testgit;

public class Student {
    private int sno;
    String name;
    private double weight;

    public Student() {
    }

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
