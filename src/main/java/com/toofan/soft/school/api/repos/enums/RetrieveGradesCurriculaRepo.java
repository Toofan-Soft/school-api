package com.toofan.soft.school.api.repos.enums;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveGradesCurriculaRepo extends API {
    Response execute() throws APIException, RemoteException;

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
