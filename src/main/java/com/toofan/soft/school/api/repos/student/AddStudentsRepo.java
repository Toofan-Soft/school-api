package com.toofan.soft.school.api.repos.student;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;
import com.toofan.soft.school.api.comon.Phone;

import java.rmi.RemoteException;
import java.util.List;

public interface AddStudentsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Student> students
    ) {}

    record Student (
            String name,
            int genderId,
            int nationalityId,
            int religionId,
            long birthdate,
            int birthplace,
            int location,
            int maritalStatusId,
            List<Phone> phones,
            byte[] image,
            Father father,
            Mother mother,
            Guardian guardian
    ) {}

    record Father (
            String name,
            int jobSectorId,
            int workId,
            int workLocation,
            int nationalityId,
            int educationalLevelId,
            List<Phone> phones
    ) {}

    record Mother (
            String name,
            int jobSectorId,
            int workId,
            int workLocation,
            int nationalityId,
            int educationalLevelId,
            List<Phone> phones
    ) {}

    record Guardian (
            String name,
            int jobSectorId,
            int workId,
            int workLocation,
            int nationalityId,
            int educationalLevelId,
            List<Phone> phones,
            int kinshipId
    ) {}
}
