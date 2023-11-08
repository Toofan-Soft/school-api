package com.toofan.soft.school.api.repos.employee;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveEmployeesRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<Employee> employees
    ) {}

    record Employee (
            int id,
            String name,
            int location,
            int maritalStatusId,
            int genderId,
            long financialNumber,
            int jobId,
            int jobTypeId
    ) {}
}
