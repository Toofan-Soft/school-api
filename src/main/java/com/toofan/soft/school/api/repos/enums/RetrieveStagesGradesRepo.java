package com.toofan.soft.school.api.repos.enums;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveStagesGradesRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<Stage> stages
    ) {}

    record Stage (
            String name,
            List<Grade> grades
    ) {}

    record Grade (
            int id,
            String name
    ) {}
}
