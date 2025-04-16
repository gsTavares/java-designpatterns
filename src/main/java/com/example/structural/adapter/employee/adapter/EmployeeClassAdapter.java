package com.example.structural.adapter.employee.adapter;

import com.example.structural.adapter.customer.Customer;
import com.example.structural.adapter.employee.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }



}
