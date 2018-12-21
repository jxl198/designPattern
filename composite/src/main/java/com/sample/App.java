package com.sample;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Employee chief = initEmployee();
        printEmployee(chief);
    }

    public static void printEmployee(Employee e){
        System.out.println(e.toString());
        List<Employee> subordinates = e.getSubordinate();
        for(int i =0;i<subordinates.size();i++){
            printEmployee(subordinates.get(i));
        }
    }

    public static Employee  initEmployee() {
        Employee chief = new Employee("SAM", "Finance", 10000);
        Employee leader = new Employee("tom", "Finance", 7000);
        Employee amy = new Employee("amy", "Finance", 4000);
        Employee sary = new Employee("sary", "Finance", 4000);
        chief.addEmployee(leader);
        chief.addEmployee(sary);
        leader.addEmployee(amy);
        return chief;
    }
}
