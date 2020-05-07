package com.example.KafkaPOC.model;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private String dept;
    private Long salary;

    public Employee() {
    }

    public Employee(String name, String dept, Long salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
