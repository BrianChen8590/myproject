package com.brian.student;

public class StudentRunner {

    public static void main(String[] args) {
        StudentBean studentBean = new StudentBean("Peter", 90, 95);
        System.out.println(studentBean.print());
        System.out.println("high : " + studentBean.highest());
    }

}
