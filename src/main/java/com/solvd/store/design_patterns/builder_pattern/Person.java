package com.solvd.store.design_patterns.builder_pattern;

class Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isEmployee;

    private Person(String firstName, String lastName, int age, boolean isEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isEmployee = isEmployee;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isEmployee=" + isEmployee +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private boolean isEmployee;

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setIsEmployee(boolean isEmployee) {
            this.isEmployee = isEmployee;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, age, isEmployee);
        }
    }

}
