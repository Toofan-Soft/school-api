package com.toofan.soft.school.api.repos.classroom;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface AddClassroomsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Building> buildings
    ) {}

    record Building (
            int id,
            int floorNumber,
            List<Classroom> classrooms
    ) {}

    record Classroom (
            String name,
            int capacity
    ) {}
}
