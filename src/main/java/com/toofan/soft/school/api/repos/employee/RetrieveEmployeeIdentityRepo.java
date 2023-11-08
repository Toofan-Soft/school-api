package com.toofan.soft.school.api.repos.employee;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;

public interface RetrieveEmployeeIdentityRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Request (
            int employeeId
    ) {}

    record Response (
            int typeId,
            long number,
            long issueDate,
            int issuePlace,
            byte[] attachment
    ) {}
}
