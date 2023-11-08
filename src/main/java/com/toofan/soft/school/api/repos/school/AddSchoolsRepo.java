package com.toofan.soft.school.api.repos.school;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface AddSchoolsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Village> villages
    ) {}

    record Village (
            int id,
            List<String> schoolsNames
    ) {}
}
