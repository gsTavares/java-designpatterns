package com.example.behavioral.chain_of_responsability.request.approver;

import com.example.behavioral.chain_of_responsability.request.LeaveApplication;

public interface LeaveApprover {
    
    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();

}
