package com.toofan.soft.school.api.repos.specialty;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifySpecialtiesRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Specialty> specialties
    ) {}

    record Specialty (
            int id,
            String name
    ) {}
}
