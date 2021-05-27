package com.company;

public class EmployeeNode {
    //there will be two fields in a node.
    //the current employee value and reference to the next
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode (Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }


}
