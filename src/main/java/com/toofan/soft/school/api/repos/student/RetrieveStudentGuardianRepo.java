package com.toofan.soft.school.api.repos.student;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;

public interface RetrieveStudentGuardianRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Request (
            int studentId
    ) {}

    record Response (
            int kinshipId,
            String name,
            int jobSectorId,
            int workId,
            int workLocation,
            int nationalityId,
            int educationalLevelId
    ) {}
}
