package com.example.structural.adapter.designer;

import com.example.structural.adapter.customer.Customer;

public class BusinessCardDesigner {
 
    public String designCard(Customer customer) {
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();

        return card;
    }
    
}
