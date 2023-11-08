package com.toofan.soft.school.api.repos.isolation;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveIsolationsRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int directorateId
    ) {}

    record Response (
            List<Directorate> directorates
    ) {}

    record Directorate (
            int id,
            List<Isolation> isolations
    ) {}

    record Isolation (
            int id,
            String name
    ) {}
}
