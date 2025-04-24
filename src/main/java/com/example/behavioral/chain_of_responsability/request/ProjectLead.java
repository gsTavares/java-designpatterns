package com.example.behavioral.chain_of_responsability.request;

import com.example.behavioral.chain_of_responsability.request.approver.LeaveApprover;

public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        // type is sick leave & duration is less or equal than 2 days
        if(leaveApplication.getType() == LeaveApplication.Type.Sick) {
            if(leaveApplication.getNoOfDays() <= 2) {
                leaveApplication.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
    
}
