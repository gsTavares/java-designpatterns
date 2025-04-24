package com.example.behavioral.chain_of_responsability.request;

import com.example.behavioral.chain_of_responsability.request.approver.LeaveApprover;

public class Manager extends Employee {
    
    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        switch (leaveApplication.getType()) {
            case Sick:
                leaveApplication.approve(getApproverRole());
                return true;
            
            case PTO:
                if(leaveApplication.getNoOfDays() <= 5) {
                    leaveApplication.approve(getApproverRole());
                    return true;
                }

            default:
                break;
        }
        return false;
    }

    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

}
