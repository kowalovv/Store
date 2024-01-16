package com.solvd.store.design_patterns.builder_pattern;

import org.w3c.dom.ls.LSOutput;

class Executor {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setFirstName("Robin")
                .setLastName("Hood")
                .setAge(31)
                .setIsEmployee(false)
                .build();

        System.out.println(person);

    }



}
