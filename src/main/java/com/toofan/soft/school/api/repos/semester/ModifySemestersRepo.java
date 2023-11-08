package com.toofan.soft.school.api.repos.semester;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifySemestersRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<SchoolYear> schoolYears
    ) {}

    record SchoolYear (
            int id,
            List<Semester> semesters
    ) {}

    record Semester (
            int id,
            long startDate,
            long endDate,
            int stateId
    ) {}}
