package com.toofan.soft.school.api.repos.specialty;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveSpecialtiesRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<Specialty> specialties
    ) {}

    record Specialty (
            int id,
            String name
    ) {}
}
