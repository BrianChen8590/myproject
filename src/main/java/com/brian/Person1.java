package com.brian;

public class Person1 {

    String name;
    Float weight;
    Float high;

    public Person1(Float weight, Float high) {
        this.weight = weight;
        this.high = high;
    }

    public Person1(String name, Float weight, Float high) {
        this(weight, high);
        this.name = name;
    }

    public float bmi() {
        return weight / (high * high);
    }

    public void hello() {
        System.out.println("Hello Java");
    }
}
