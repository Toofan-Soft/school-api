package com.toofan.soft.school.api.repos.employee;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface DeleteEmployeesRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Integer> employeesIds
    ) {}
}
