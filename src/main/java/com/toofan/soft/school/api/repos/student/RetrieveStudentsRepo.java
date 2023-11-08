package com.toofan.soft.school.api.repos.student;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveStudentsRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<Student> students
    ) {}

    record Student (
            int id,
            String name,
            int genderId,
            int nationalityId,
            int religionId,
            long birthdate,
            int birthplace,
            int location,
            int maritalStatusId
    ) {}

}
