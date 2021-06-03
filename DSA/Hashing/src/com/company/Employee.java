package com.company;

public class Employee {

    public String firstName;
    public String lastName;
    public int id;


    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    public void setFirstName() {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }


    public void setLastName() {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }


    public void setId() {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String toString() {
        return "Employee {" +
                "First name = " + '\'' + firstName + '\'' +
                ", Last name = " + '\'' + lastName + '\'' +
                ", id = " + '\'' + id + '\'' +
                "}";
    }
}
