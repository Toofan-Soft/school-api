package com.toofan.soft.school.api.repos.school_year;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveSchoolYearsRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<SchoolYear> schoolYears
    ) {}

    record SchoolYear (
            int id,
            long startDate,
            long endDate,
            int stateId
    ) {}
}
