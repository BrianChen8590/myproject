package com.brian.student;

public class StudentBean {

    private String id;
    private String name;
    private int english;
    private int math;

    public StudentBean(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
        return (english > math) ? english : math;
    }

    public String print() {
        return "Name : " + this.name + ", English : " + this.english + ", Math : " + this.math;
    }

}
