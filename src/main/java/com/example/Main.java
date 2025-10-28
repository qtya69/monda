package com.example;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.example.models.Employee;
import com.example.models.EmployeeSource;
import com.example.models.Sqlite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        EmployeeSource es=new EmployeeSource(new Sqlite());

        Employee newemp=new Employee("Csomó Szilveszter", "Budapest", new BigDecimal(397.2));
        es.store(newemp);

        ArrayList<Employee> empList=es.index();
        empList.forEach((emp) -> {
            System.out.println(emp.getName());
        });
        // ArrayList<Employee> empList=new EmployeeSource(new Sqlite()).index();
    }
}