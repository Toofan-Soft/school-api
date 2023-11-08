package com.toofan.soft.school.api.repos.employee;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;

public interface RetrieveEmployeeJobRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Request (
            int employeeId
    ) {}

    record Response (
            long jobNumber,
            long employmentDate,
            long workStartDate,
            long workEndDate,
            long financialNumber,
            int jobId,
            int jobTypeId,
            long sendingDate,
            int functionalClassId,
            int employeeStateId
    ) {}
}
