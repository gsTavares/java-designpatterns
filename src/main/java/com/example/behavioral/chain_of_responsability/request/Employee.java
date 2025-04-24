package com.example.behavioral.chain_of_responsability.request;

import com.example.behavioral.chain_of_responsability.request.approver.LeaveApprover;

public abstract class Employee implements LeaveApprover {

    private String role;
    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public String getApproverRole() {
        return role;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if(!processRequest(leaveApplication) && successor != null) {
            successor.processLeaveApplication(leaveApplication);
        }
    }

    protected abstract boolean processRequest(LeaveApplication leaveApplication);

}
