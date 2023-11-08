package com.toofan.soft.school.api.repos.directorate;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifyDirectoratesRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Directorate> directorates
    ) {}

    record Directorate (
            int id,
            String name
    ) {}
}
