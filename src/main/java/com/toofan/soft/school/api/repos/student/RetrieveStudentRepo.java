package com.toofan.soft.school.api.repos.student;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;

public interface RetrieveStudentRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Request (
            int studentId
    ) {}

    record Response (
            String name,
            int genderId,
            int nationalityId,
            int religionId,
            long birthdate,
            int birthplace,
            int location,
            int maritalStatusId,
            byte[] image
    ) {}
}
