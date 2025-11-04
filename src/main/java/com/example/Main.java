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
        // es.store(newemp);

        Employee updateemp=new Employee("Tank Aranka", "Budapest", new BigDecimal(397.5));
        // es.update(updateemp, 5);

        ArrayList<Employee> empList=es.index();
        empList.forEach((emp) -> {
            System.out.printf(
                "%d %s\n",
                emp.getName(),
                emp.getId(),
                emp.getCity()
                );
        });
        // ArrayList<Employee> empList=new EmployeeSource(new Sqlite()).index();
    }
}