package com.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-03 14:38
 **/
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinate;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinate = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(List<Employee> subordinate) {
        this.subordinate = subordinate;
    }

    public void addEmployee(Employee e) {
        this.subordinate.add(e);
    }

    @Override
    public String toString() {
        return "name=" + name + ",dept=" + dept + ",salary=" + salary;
    }
}
