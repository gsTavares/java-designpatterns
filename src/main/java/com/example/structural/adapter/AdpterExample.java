package com.example.structural.adapter;

import com.example.structural.adapter.designer.BusinessCardDesigner;
import com.example.structural.adapter.employee.Employee;
import com.example.structural.adapter.employee.adapter.EmployeeClassAdapter;
import com.example.structural.adapter.employee.adapter.EmployeeObjectAdapter;

public class AdpterExample {
    public static void main(String[] args) {
        
        // With class adapter (2-way)
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("***********");

        // With object adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter adapter2 = new EmployeeObjectAdapter(employee);

        card = designer.designCard(adapter2);
        System.out.println(card);

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}
