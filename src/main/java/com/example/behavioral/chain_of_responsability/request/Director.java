package com.example.behavioral.chain_of_responsability.request;

import com.example.behavioral.chain_of_responsability.request.LeaveApplication.Type;
import com.example.behavioral.chain_of_responsability.request.approver.LeaveApprover;

public class Director extends Employee {

    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if(leaveApplication.getType() == Type.PTO) {
            leaveApplication.approve(getApproverRole());
            return true;
        }
        return false;
    }
    
}
