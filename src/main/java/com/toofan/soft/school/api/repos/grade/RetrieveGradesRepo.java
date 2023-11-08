package com.toofan.soft.school.api.repos.grade;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveGradesRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int schoolYearId
    ) {}

    record Response (
            List<Integer> gradesIds
    ) {}
}
