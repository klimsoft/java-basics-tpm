package org.example.ex11;

public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person("Johny", 30);
        System.out.println(p1.getName());
        System.out.println(p1.getDetails());
        Employee e1 = new Employee("Lisa", 25, "001", 6000);
        System.out.println(e1.getDetails());
    }
}
