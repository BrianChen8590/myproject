package com.brian;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
        Person1 person1 = new Person1(70f, 1.75f);
        person1.weight = 70f;
        person1.high = 1.75f;
        System.out.println(person1.bmi());

//        int a = 123;
//        float b = 123.5f;
//        double c = 123.5;
//        char d = 'a';
//        boolean e = false;
//        String f = "d";
//        byte g = 3;
    }
}
