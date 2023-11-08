package com.toofan.soft.school.api.repos.classroom;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifyClassroomsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Classroom> classrooms
    ) {}

    record Classroom (
            int id,
            String name,
            int capacity
    ) {}
}
