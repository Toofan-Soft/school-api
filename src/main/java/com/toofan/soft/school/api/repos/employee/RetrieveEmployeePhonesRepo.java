package com.toofan.soft.school.api.repos.employee;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;
import com.toofan.soft.school.api.comon.Phone;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveEmployeePhonesRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Request (
            int employeeId
    ) {}

    record Response (
            List<Phone> phones
    ) {}
}
