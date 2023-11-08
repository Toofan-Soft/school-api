package com.toofan.soft.school.api.repos.curriculum;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface AddCurriculaRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<SchoolYear> schoolYears
    ) {}

    record SchoolYear (
            int id,
            List<Grade> grades
    ) {}

    record Grade (
            int id,
            List<Integer> curriculaIds
    ) {}
}
