package com.toofan.soft.school.api.repos.enums;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveBloodTypesRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<BloodType> bloodTypes
    ) {}

    record BloodType (
            int id,
            String name
    ) {}
}
