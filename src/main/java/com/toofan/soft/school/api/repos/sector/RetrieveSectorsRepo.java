package com.toofan.soft.school.api.repos.sector;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveSectorsRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<Sector> sectors
    ) {}

    record Sector (
            int id,
            String name
    ) {}
}
