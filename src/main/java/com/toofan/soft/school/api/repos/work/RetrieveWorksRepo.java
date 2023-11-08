package com.toofan.soft.school.api.repos.work;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveWorksRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int sectorId
    ) {}

    record Response (
            List<Sector> sectors
    ) {}

    record Sector (
            int id,
            List<Work> works
    ) {}

    record Work (
            int id,
            String name
    ) {}
}
