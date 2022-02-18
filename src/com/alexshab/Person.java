package com.alexshab;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int weight;
    private int growth;


    public Person(String firstName, String lastName, int age, int weight, int growth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + "years" +
                ", growth=" + growth + "cm" +
                ", weight=" + weight + "kg" +
                '}';
    }
}