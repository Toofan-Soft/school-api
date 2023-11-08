package com.toofan.soft.school.api.repos.employee;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;

public interface RetrieveEmployeeRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Request (
            int employeeId
    ) {}

    record Response (
            String name,
            byte[] image,
            long birthdate,
            int birthplace,
            int location,
            int maritalStatusId,
            int genderId,
            int bloodTypeId,
            int nationalityId,
            int religionId
    ) {}
}
