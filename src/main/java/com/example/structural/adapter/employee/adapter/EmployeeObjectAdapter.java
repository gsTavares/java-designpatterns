package com.example.structural.adapter.employee.adapter;

import com.example.structural.adapter.customer.Customer;
import com.example.structural.adapter.employee.Employee;

public class EmployeeObjectAdapter implements Customer {

    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
    
}
