package com.company;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.ArrayList<>(); //default backing capacity of ArrayList is 10
        employeeList.add(new Employee("Jannet", "Thompson", 1234));
        employeeList.add(new Employee("Mike", "Stevenson", 5678));
        employeeList.add(new Employee("Monica", "Gerret", 3490));
        employeeList.add(new Employee("Huma", "Qureshi", 1234));

        //for each employee we want to print the employee details
        //lambda expression
        employeeList.forEach(System.out::println);

        //to print out only 2nd employee
        System.out.println(employeeList.get(1));

        //to see if the list is empty
        System.out.println(employeeList.isEmpty());

        //replace employee at a specific position with another  //(index which you want to replace, what you want to add)
        employeeList.set(1, new Employee("John", "Adams", 4567));


        //(.add) == to add consecutively at the end
        //(.set) == to replace in the middle

        for (Employee employee : employeeList) System.out.println(employee);

        //List have a time complexity of O(1);

        //to find how many employees we've added to the list
        System.out.println(employeeList.size());

        //add at a particular index and all the other are shifted accordingly
        employeeList.add(3, new Employee("Mata", "Sundari", 4444));
        for (Employee employee : employeeList) System.out.println(employee);

        //convert the list to an array
        Object[] employeeArray = employeeList.toArray(new Employee[0]);
        //array of object made to an employee List Array
        //to make that employee array we specify that's what we want
        //(new Employee[size of what we want]) --> here the size is the length of the list

        System.out.println();

        //print the employee array
        for(Object Employee : employeeArray) System.out.println(Employee);
        //this is the object/constructor     object array                   this is the object initialized here
    }
}
