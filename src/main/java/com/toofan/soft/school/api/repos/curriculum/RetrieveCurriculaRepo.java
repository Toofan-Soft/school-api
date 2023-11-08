package com.toofan.soft.school.api.repos.curriculum;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveCurriculaRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int schoolYearId,
            int gradeId
    ) {}

    record Response (
            List<Grade> grades
    ) {}

    record Grade (
            int id,
            List<Curriculum> curricula
    ) {}

    record Curriculum (
            int id,
            int typeId
    ) {}
}
