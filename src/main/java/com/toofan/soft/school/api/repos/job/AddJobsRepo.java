package com.toofan.soft.school.api.repos.job;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface AddJobsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<String> jobNames
    ) {}
}
