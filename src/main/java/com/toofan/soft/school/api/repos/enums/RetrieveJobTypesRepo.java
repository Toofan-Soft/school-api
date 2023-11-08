package com.toofan.soft.school.api.repos.enums;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveJobTypesRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<JobType> jobTypes
    ) {}

    record JobType (
            int id,
            String name
    ) {}
}
