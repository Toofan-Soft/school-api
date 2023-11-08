package com.toofan.soft.school.api.repos.classroom;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveClassroomsRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int buildingId,
            int floorNumber
    ) {}

    record Response (
            List<Building> buildings
    ) {}

    record Building (
            int id,
            List<Floor> floors
    ) {}

    record Floor (
            int number,
            List<Classroom> classrooms
    ) {}

    record Classroom (
            int id,
            String name,
            int capacity
    ) {}
}
