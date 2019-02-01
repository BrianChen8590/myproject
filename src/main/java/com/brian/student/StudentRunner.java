package com.brian.student;

public class StudentRunner {

    public static void main(String[] args) {
        StudentBean studentBean = new StudentBean("Peter", 90, 85);
        System.out.println(studentBean.print());
    }

}
