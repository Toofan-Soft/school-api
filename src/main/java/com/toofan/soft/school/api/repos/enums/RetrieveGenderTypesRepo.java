package com.toofan.soft.school.api.repos.enums;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveGenderTypesRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<GenderType> genderTypes
    ) {}

    record GenderType (
            int id,
            String name
    ) {}
}
