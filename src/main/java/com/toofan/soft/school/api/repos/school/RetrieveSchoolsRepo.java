package com.toofan.soft.school.api.repos.school;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveSchoolsRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int villageId
    ) {}

    record Response (
            List<Village> villages
    ) {}

    record Village (
            int id,
            List<School> schools
    ) {}

    record School (
            int id,
            String name
    ) {}
}
