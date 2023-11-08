package com.toofan.soft.school.api.repos.building;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface AddBuildingRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Building> buildings
    ) {}

    record Building (
       String name,
       int floorCount
    ) {}
}
