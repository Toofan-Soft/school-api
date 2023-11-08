package com.toofan.soft.school.api.repos.directorate;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveDirectoratesRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int governorateId
    ) {}

    record Response (
            List<Governorate> governorates
    ) {}

    record Governorate (
            int id,
            List<Directorate> directorates
    ) {}

    record Directorate (
            int id,
            String name
    ) {}
}
