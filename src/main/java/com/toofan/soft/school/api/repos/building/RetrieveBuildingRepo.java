package com.toofan.soft.school.api.repos.building;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveBuildingRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<Building> buildings
    ) {}

    record Building (
            int id,
            String name,
            int floorCount
    ) {}
}
