package com.toofan.soft.school.api.repos.isolation;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface AddIsolationsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Directorate> directorates
    ) {}

    record Directorate (
            int id,
            List<String> isolationsNames
    ) {}
}
