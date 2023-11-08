package com.toofan.soft.school.api.repos.semester;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveSemestersRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int schoolYearId
    ) {}

    record Response (
            List<Semester> semesters
    ) {}

    record Semester (
            int id,
            long startDate,
            long endDate,
            int stateId
    ) {}
}
