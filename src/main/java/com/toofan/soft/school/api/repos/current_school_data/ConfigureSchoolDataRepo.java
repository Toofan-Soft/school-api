package com.toofan.soft.school.api.repos.current_school_data;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;
import com.toofan.soft.school.api.comon.Phone;

import java.rmi.RemoteException;
import java.util.List;

public interface ConfigureSchoolDataRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            String name,
            int address,
            List<Phone> phones,
            String email,
            EducationAdministration educationAdministration
    ) {}

    record EducationAdministration  (
            String hrdHeadName,
            String govEduDirectorName,
            String govExamDirectorName,
            String govSpecialistName,
            String dirEduDirectorName,
            String dirExamDirectorName,
            String dirSpecialistName
    ) {}
}
