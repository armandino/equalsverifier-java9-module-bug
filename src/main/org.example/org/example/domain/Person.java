package org.example.domain;

import nl.jqno.equalsverifier.EqualsVerifier;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Person[name=%s, age=%s]", name, age);
    }

    public static void main(String[] args) {
        EqualsVerifier.forClass(Person.class).verify();
    }
}