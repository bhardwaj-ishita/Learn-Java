package com.company;

public class singlyLinkedList {

    public static void main(String[] args) {
        Employee janetteThompson = new Employee("Jannet", "Thompson", 1234);
        Employee mikeStevenson = new Employee("Mike", "Stevenson", 5678);
        Employee monicaGarret = new Employee("Monica", "Gerret", 3490);
        Employee humaQureshi = new Employee("Huma", "Qureshi", 1234);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(janetteThompson);
        list.addToFront(mikeStevenson);
        list.addToFront(monicaGarret);
        list.addToFront(humaQureshi);

        System.out.println(list.getSize());

        list.printList();



    }
}
