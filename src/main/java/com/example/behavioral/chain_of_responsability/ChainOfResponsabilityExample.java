package com.example.behavioral.chain_of_responsability;

import java.time.LocalDate;

import com.example.behavioral.chain_of_responsability.request.Director;
import com.example.behavioral.chain_of_responsability.request.LeaveApplication;
import com.example.behavioral.chain_of_responsability.request.Manager;
import com.example.behavioral.chain_of_responsability.request.ProjectLead;
import com.example.behavioral.chain_of_responsability.request.LeaveApplication.Type;
import com.example.behavioral.chain_of_responsability.request.approver.LeaveApprover;

public class ChainOfResponsabilityExample {
    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder()
            .withType(Type.Sick)
            .from(LocalDate.now())
            .to(LocalDate.of(2025, 5, 1))
            .build();
        
        System.out.println(application);
        System.out.println("*****************");

        LeaveApprover approver = createChain();

        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead lead = new ProjectLead(manager);

        return lead;
    }

}
