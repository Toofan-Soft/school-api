package com.toofan.soft.school.api.repos.school;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifySchoolsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<School> schools
    ) {}

    record School (
            int id,
            String name
    ) {}
}
