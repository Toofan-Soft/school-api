package com.toofan.soft.school.api.repos.job;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveJobsRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<Job> jobs
    ) {}

    record Job (
            int id,
            String name
    ) {}
}
