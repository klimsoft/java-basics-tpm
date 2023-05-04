package org.example.ex11;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }

    public String getName() {
        return name;
    }
}
